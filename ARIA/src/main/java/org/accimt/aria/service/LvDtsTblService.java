package org.accimt.aria.service;

import org.accimt.aria.dto.LvDtsTblDto;
import java.util.List;

public interface LvDtsTblService {
    LvDtsTblDto getLvDtsTblById(Integer id);
    List<LvDtsTblDto> getAllLvDtsTbls();
}
