package org.accimt.aria.service;

import org.accimt.aria.dto.EmpSlvTblDto;
import java.util.List;

public interface EmpSlvTblService {
    EmpSlvTblDto getEmpSlvTblById(Integer id);
    List<EmpSlvTblDto> getAllEmpSlvTbls();
}
