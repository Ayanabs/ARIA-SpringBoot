package org.accimt.aria.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.EmployeeDto;
import org.accimt.aria.service.EmployeeService;
import org.accimt.aria.security.JwtTokenProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class EmployeeControllerTest {

    private MockMvc mockMvc;

    @Mock
    private EmployeeService employeeService;

    @Mock
    private AuthenticationManager authenticationManager;

    @Mock
    private JwtTokenProvider jwtTokenProvider;

    private ObjectMapper objectMapper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        EmployeeController employeeController = new EmployeeController(
                employeeService,
                authenticationManager,
                jwtTokenProvider
        );
        mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();
        objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());
    }

    @Test
    void getAllEmployees_ReturnsListAndOk() throws Exception {
        EmployeeDto empDto = new EmployeeDto();
        empDto.setId(1L);
        empDto.setFullname("John Doe");
        empDto.setEmail("john.doe@example.com");

        List<EmployeeDto> employees = Collections.singletonList(empDto);
        when(employeeService.getAllEmployees()).thenReturn(employees);

        mockMvc.perform(get("/api/employees"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()").value(1))
                .andExpect(jsonPath("$[0].id").value(1L))
                .andExpect(jsonPath("$[0].fullname").value("John Doe"))
                .andExpect(jsonPath("$[0].email").value("john.doe@example.com"));

        verify(employeeService, times(1)).getAllEmployees();
    }

    @Test
    void getEmployeeById_ReturnsEmployeeAndOk() throws Exception {
        EmployeeDto empDto = new EmployeeDto();
        empDto.setId(1L);
        empDto.setFullname("John Doe");
        empDto.setEmail("john.doe@example.com");

        when(employeeService.getEmployeeById(1L)).thenReturn(empDto);

        mockMvc.perform(get("/api/employees/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.fullname").value("John Doe"))
                .andExpect(jsonPath("$.email").value("john.doe@example.com"));

        verify(employeeService, times(1)).getEmployeeById(1L);
    }

    @Test
    void createEmployee_WithValidData_ReturnsCreatedEmployee() throws Exception {
        EmployeeDto inputDto = new EmployeeDto();
        inputDto.setFullname("Jane Doe");
        inputDto.setEmail("jane.doe@example.com");

        EmployeeDto savedDto = new EmployeeDto();
        savedDto.setId(2L);
        savedDto.setFullname("Jane Doe");
        savedDto.setEmail("jane.doe@example.com");

        when(employeeService.createEmployee(any(EmployeeDto.class))).thenReturn(savedDto);

        mockMvc.perform(post("/api/employees")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(inputDto)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(2L))
                .andExpect(jsonPath("$.fullname").value("Jane Doe"))
                .andExpect(jsonPath("$.email").value("jane.doe@example.com"));

        verify(employeeService, times(1)).createEmployee(any(EmployeeDto.class));
    }

    @Test
    void createEmployee_WithInvalidData_ReturnsBadRequest() throws Exception {
        EmployeeDto invalidDto = new EmployeeDto();

        mockMvc.perform(post("/api/employees")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(invalidDto)))
                .andExpect(status().isBadRequest());

        verifyNoInteractions(employeeService);
    }

    @Test
    void getEmployeeByEmail_ReturnsEmployeeAndOk() throws Exception {
        EmployeeDto empDto = new EmployeeDto();
        empDto.setId(1L);
        empDto.setFullname("John Doe");
        empDto.setEmail("john.doe@example.com");

        when(employeeService.getEmployeeByEmail("john.doe@example.com")).thenReturn(empDto);

        mockMvc.perform(get("/api/employees/email/john.doe@example.com"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.fullname").value("John Doe"))
                .andExpect(jsonPath("$.email").value("john.doe@example.com"));

        verify(employeeService, times(1)).getEmployeeByEmail("john.doe@example.com");
    }

    @Test
    void getEmployeeByEmpno_ReturnsEmployeeAndOk() throws Exception {
        EmployeeDto empDto = new EmployeeDto();
        empDto.setId(1L);
        empDto.setEmpno(101);
        empDto.setFullname("John Doe");

        when(employeeService.getEmployeeByEmpno(101)).thenReturn(empDto);

        mockMvc.perform(get("/api/employees/empno/101"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.empno").value(101))
                .andExpect(jsonPath("$.fullname").value("John Doe"));

        verify(employeeService, times(1)).getEmployeeByEmpno(101);
    }

    @Test
    void getEmployeeByNicnum_ReturnsEmployeeAndOk() throws Exception {
        EmployeeDto empDto = new EmployeeDto();
        empDto.setId(1L);
        empDto.setNicnum("123456789V");
        empDto.setFullname("John Doe");

        when(employeeService.getEmployeeByNicnum("123456789V")).thenReturn(empDto);

        mockMvc.perform(get("/api/employees/nic/123456789V"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.nicnum").value("123456789V"))
                .andExpect(jsonPath("$.fullname").value("John Doe"));

        verify(employeeService, times(1)).getEmployeeByNicnum("123456789V");
    }

    @Test
    void getEmployeesByPhone_ReturnsListAndOk() throws Exception {
        EmployeeDto empDto = new EmployeeDto();
        empDto.setId(1L);
        empDto.setMobileno("0771234567");
        empDto.setFullname("John Doe");

        List<EmployeeDto> employees = Collections.singletonList(empDto);
        when(employeeService.getEmployeesByPhone("0771234567")).thenReturn(employees);

        mockMvc.perform(get("/api/employees/phone/0771234567"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()").value(1))
                .andExpect(jsonPath("$[0].id").value(1L))
                .andExpect(jsonPath("$[0].mobileno").value("0771234567"))
                .andExpect(jsonPath("$[0].fullname").value("John Doe"));

        verify(employeeService, times(1)).getEmployeesByPhone("0771234567");
    }
}
