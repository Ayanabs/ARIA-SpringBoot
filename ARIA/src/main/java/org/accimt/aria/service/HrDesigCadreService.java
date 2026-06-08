package org.accimt.aria.service;

import org.accimt.aria.dto.HrDesigCadreDto;
import java.util.List;

public interface HrDesigCadreService {
    HrDesigCadreDto getHrDesigCadreById(Integer id);
    List<HrDesigCadreDto> getAllHrDesigCadres();
}
