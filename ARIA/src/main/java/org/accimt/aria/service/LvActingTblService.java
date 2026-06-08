package org.accimt.aria.service;

import org.accimt.aria.dto.LvActingTblDto;
import java.util.List;

public interface LvActingTblService {
    LvActingTblDto getLvActingTblById(Integer id);
    List<LvActingTblDto> getAllLvActingTbls();
}
