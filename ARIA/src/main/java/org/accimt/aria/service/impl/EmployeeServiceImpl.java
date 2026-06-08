package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.EmployeeDto;
import org.accimt.aria.entity.Employee;
import org.accimt.aria.mapping.EmployeeMapping;
import org.accimt.aria.repository.EmployeeRepository;
import org.accimt.aria.service.EmployeeService;
import org.accimt.aria.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapping employeeMapping;


    @Override
    public EmployeeDto getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + id));
        return employeeMapping.toDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        return employeeRepository.findAll().stream()
                .map(employeeMapping::toDto)
                .collect(java.util.stream.Collectors.toList());
    }


    @Override
    public EmployeeDto getEmployeeByEmail(String email) {
        Employee employee = employeeRepository.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with email: " + email));
        return employeeMapping.toDto(employee);
    }

    @Override
    public EmployeeDto getEmployeeByEmpno(Integer empno) {
        Employee employee = employeeRepository.findByEmpno(empno)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with employee number: " + empno));
        return employeeMapping.toDto(employee);
    }

    @Override
    public EmployeeDto getEmployeeByNicnum(String nicnum) {
        Employee employee = employeeRepository.findByNicnum(nicnum)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with NIC number: " + nicnum));
        return employeeMapping.toDto(employee);
    }

    @Override
    public List<EmployeeDto> getEmployeesByPhone(String phone) {
        return employeeRepository.findByMobilenoOrPhoneOfficeOrPhoneResidence(phone, phone, phone).stream()
                .map(employeeMapping::toDto)
                .collect(java.util.stream.Collectors.toList());
    }

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = employeeMapping.mapToEntity(employeeDto);
        Employee saved = employeeRepository.save(employee);
        return employeeMapping.toDto(saved);
    }
}
