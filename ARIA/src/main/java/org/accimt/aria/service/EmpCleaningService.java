package org.accimt.aria.service;

import org.accimt.aria.dto.EmpCleaningDto;
import java.util.List;

public interface EmpCleaningService {
    EmpCleaningDto getEmpCleaningById(Integer id);
    List<EmpCleaningDto> getAllEmpCleanings();
}
