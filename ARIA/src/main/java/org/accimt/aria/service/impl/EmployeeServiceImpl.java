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
    public EmployeeDto createEmployee(EmployeeDto dto) {
        Employee entity = employeeMapping.mapToEntity(dto);
        Employee savedEmployee = employeeRepository.save(entity);
        return employeeMapping.toDto(savedEmployee);
    }

    @Override
    public EmployeeDto updateEmployee(EmployeeDto dto) {
        Employee existingEmployee = employeeRepository.findById(dto.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + dto.getId()));

        if (dto.getEmpno() != null) existingEmployee.setEmpno(dto.getEmpno());
        if (dto.getTitle() != null) existingEmployee.setTitle(dto.getTitle());
        if (dto.getFullname() != null) existingEmployee.setFullname(dto.getFullname());
        if (dto.getNicnum() != null) existingEmployee.setNicnum(dto.getNicnum());
        if (dto.getDob() != null) existingEmployee.setDob(dto.getDob());
        if (dto.getGender() != null) existingEmployee.setGender(dto.getGender());
        if (dto.getEmail() != null) existingEmployee.setEmail(dto.getEmail());
        if (dto.getMobileno() != null) existingEmployee.setMobileno(dto.getMobileno());
        if (dto.getDateofappoinment() != null) existingEmployee.setDateofappoinment(dto.getDateofappoinment());
        if (dto.getDivisioncode() != null) existingEmployee.setDivisioncode(dto.getDivisioncode());
        if (dto.getDesigcode() != null) existingEmployee.setDesigcode(dto.getDesigcode());
        if (dto.getEmptypecode() != null) existingEmployee.setEmptypecode(dto.getEmptypecode());
        if (dto.getCategorycode() != null) existingEmployee.setCategorycode(dto.getCategorycode());
        if (dto.getRetirementdt() != null) existingEmployee.setRetirementdt(dto.getRetirementdt());
        if (dto.getProbationperiod() != null) existingEmployee.setProbationperiod(dto.getProbationperiod());
        if (dto.getProbationperiodto() != null) existingEmployee.setProbationperiodto(dto.getProbationperiodto());
        if (dto.getResignation() != null) existingEmployee.setResignation(dto.getResignation());
        if (dto.getAddress() != null) existingEmployee.setAddress(dto.getAddress());
        if (dto.getAddress2() != null) existingEmployee.setAddress2(dto.getAddress2());
        if (dto.getAddress3() != null) existingEmployee.setAddress3(dto.getAddress3());
        if (dto.getSalarycode() != null) existingEmployee.setSalarycode(dto.getSalarycode());
        if (dto.getMaritalstatus() != null) existingEmployee.setMaritalstatus(dto.getMaritalstatus());
        if (dto.getGrade() != null) existingEmployee.setGrade(dto.getGrade());
        if (dto.getTBillEntitle() != null) existingEmployee.setTBillEntitle(dto.getTBillEntitle());
        if (dto.getPhoneOffice() != null) existingEmployee.setPhoneOffice(dto.getPhoneOffice());
        if (dto.getPhoneResidence() != null) existingEmployee.setPhoneResidence(dto.getPhoneResidence());
        if (dto.getEmpNamewithInit() != null) existingEmployee.setEmpNamewithInit(dto.getEmpNamewithInit());
        if (dto.getIncrementDate() != null) existingEmployee.setIncrementDate(dto.getIncrementDate());
        if (dto.getStatus() != null) existingEmployee.setStatus(dto.getStatus());

        Employee updatedEmployee = employeeRepository.save(existingEmployee);
        return employeeMapping.toDto(updatedEmployee);
    }

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
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }
}
