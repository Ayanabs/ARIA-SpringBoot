package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.accimt.aria.dto.DivisionDto;
import org.accimt.aria.dto.EmployeeDto;
import org.accimt.aria.entity.Division;
import org.accimt.aria.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class DivisionMapping {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public DivisionDto toDto(Division entity) {
        if (entity == null) {
            return null;
        }
        DivisionDto dto = new DivisionDto();
        dto.setDivisioncode(entity.getDivisioncode());
        dto.setDivision(entity.getDivision());
        dto.setShCode(entity.getShCode());
        dto.setHod(entity.getHod());
        dto.setDdg(entity.getDdg());
        dto.setDg(entity.getDg());
        if (entity.getHeadOfDivision() != null) {
            dto.setHeadOfDivision(mapEmployeeToDto(entity.getHeadOfDivision()));
        }
        if (entity.getDeputyDirectorGeneral() != null) {
            dto.setDeputyDirectorGeneral(mapEmployeeToDto(entity.getDeputyDirectorGeneral()));
        }
        if (entity.getDirectorGeneral() != null) {
            dto.setDirectorGeneral(mapEmployeeToDto(entity.getDirectorGeneral()));
        }
        return dto;
    }

    private EmployeeDto mapEmployeeToDto(Employee employee) {
        if (employee == null) {
            return null;
        }
        EmployeeDto dto = new EmployeeDto();
        dto.setId(employee.getId());
        dto.setEmpno(employee.getEmpno());
        dto.setTitle(employee.getTitle());
        dto.setFullname(employee.getFullname());
        dto.setNicnum(employee.getNicnum());
        dto.setDob(employee.getDob());
        dto.setGender(employee.getGender());
        dto.setEmail(employee.getEmail());
        dto.setMobileno(employee.getMobileno());
        dto.setDateofappoinment(employee.getDateofappoinment());
        dto.setRetirementdt(employee.getRetirementdt());
        dto.setProbationperiod(employee.getProbationperiod());
        dto.setProbationperiodto(employee.getProbationperiodto());
        dto.setResignation(employee.getResignation());
        dto.setAddress(employee.getAddress());
        dto.setAddress2(employee.getAddress2());
        dto.setAddress3(employee.getAddress3());
        dto.setSalarycode(employee.getSalarycode());
        dto.setMaritalstatus(employee.getMaritalstatus());
        dto.setGrade(employee.getGrade());
        dto.setTBillEntitle(employee.getTBillEntitle());
        dto.setPhoneOffice(employee.getPhoneOffice());
        dto.setPhoneResidence(employee.getPhoneResidence());
        dto.setEmpNamewithInit(employee.getEmpNamewithInit());
        dto.setIncrementDate(employee.getIncrementDate());
        dto.setStatus(employee.getStatus());
        dto.setDivisioncode(employee.getDivisioncode());
        dto.setDesigcode(employee.getDesigcode());
        dto.setEmptypecode(employee.getEmptypecode());
        dto.setCategorycode(employee.getCategorycode());
        return dto;
    }

    public Division mapToEntity(DivisionDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, Division.class);
    }
}
