package org.accimt.aria.service;

import org.accimt.aria.dto.EmpLvTblDto;
import java.util.List;

public interface EmpLvTblService {
    EmpLvTblDto getEmpLvTblById(Integer id);
    List<EmpLvTblDto> getAllEmpLvTbls();
}
