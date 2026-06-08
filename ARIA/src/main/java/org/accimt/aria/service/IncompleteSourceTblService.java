package org.accimt.aria.service;

import org.accimt.aria.dto.IncompleteSourceTblDto;
import java.util.List;

public interface IncompleteSourceTblService {
    IncompleteSourceTblDto getIncompleteSourceTblById(Integer id);
    List<IncompleteSourceTblDto> getAllIncompleteSourceTbls();
}
