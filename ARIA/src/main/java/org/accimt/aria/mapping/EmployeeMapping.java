package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.EmployeeDto;
import org.accimt.aria.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    private final CategoryMapping categoryMapping;
    private final DivisionMapping divisionMapping;
    private final DesignationMapping designationMapping;
    private final EmpTypeMapping empTypeMapping;
    private final HrSalaryMapping hrSalaryMapping;

    public EmployeeMapping(CategoryMapping categoryMapping, DivisionMapping divisionMapping,
                           DesignationMapping designationMapping, EmpTypeMapping empTypeMapping,
                           HrSalaryMapping hrSalaryMapping) {
        this.categoryMapping = categoryMapping;
        this.divisionMapping = divisionMapping;
        this.designationMapping = designationMapping;
        this.empTypeMapping = empTypeMapping;
        this.hrSalaryMapping = hrSalaryMapping;
    }

    public EmployeeDto toDto(Employee entity) {
        if (entity == null) {
            return null;
        }
        EmployeeDto dto = objectMapper.convertValue(entity, EmployeeDto.class);
        if (entity.getCategory() != null) {
            dto.setCategory(categoryMapping.toDto(entity.getCategory()));
        }
        if (entity.getDivision() != null) {
            dto.setDivision(divisionMapping.toDto(entity.getDivision()));
        }
        if (entity.getDesignation() != null) {
            dto.setDesignation(designationMapping.toDto(entity.getDesignation()));
        }
        if (entity.getEmpType() != null) {
            dto.setEmpType(empTypeMapping.toDto(entity.getEmpType()));
        }
        if (entity.getHrSalary() != null) {
            dto.setHrSalary(hrSalaryMapping.toDto(entity.getHrSalary()));
        }
        return dto;
    }

    public Employee mapToEntity(EmployeeDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, Employee.class);
    }
}
