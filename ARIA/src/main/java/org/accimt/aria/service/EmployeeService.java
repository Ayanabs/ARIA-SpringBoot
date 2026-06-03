package org.accimt.aria.service;

import org.accimt.aria.dto.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto dto);
    EmployeeDto updateEmployee(EmployeeDto dto);
    EmployeeDto getEmployeeById(Long id);
    List<EmployeeDto> getAllEmployees();
    void deleteEmployeeById(Long id);
    EmployeeDto getEmployeeByEmail(String email);
    EmployeeDto getEmployeeByEmpno(Integer empno);
    EmployeeDto getEmployeeByNicnum(String nicnum);
    List<EmployeeDto> getEmployeesByPhone(String phone);
}
