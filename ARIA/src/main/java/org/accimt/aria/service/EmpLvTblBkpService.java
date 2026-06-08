package org.accimt.aria.service;

import org.accimt.aria.dto.EmpLvTblBkpDto;
import java.util.List;

public interface EmpLvTblBkpService {
    EmpLvTblBkpDto getEmpLvTblBkpById(Integer id);
    List<EmpLvTblBkpDto> getAllEmpLvTblBkps();
}
