package org.accimt.aria.service;

import org.accimt.aria.dto.EmpGradeDto;
import java.util.List;

public interface EmpGradeService {
    EmpGradeDto getEmpGradeById(Integer id);
    List<EmpGradeDto> getAllEmpGrades();
}
