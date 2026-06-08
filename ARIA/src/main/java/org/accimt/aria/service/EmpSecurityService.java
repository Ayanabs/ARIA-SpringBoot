package org.accimt.aria.service;

import org.accimt.aria.dto.EmpSecurityDto;
import java.util.List;

public interface EmpSecurityService {
    EmpSecurityDto getEmpSecurityById(Integer id);
    List<EmpSecurityDto> getAllEmpSecurities();
}
