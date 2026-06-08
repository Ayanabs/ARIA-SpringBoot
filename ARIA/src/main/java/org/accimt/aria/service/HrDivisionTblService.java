package org.accimt.aria.service;

import org.accimt.aria.dto.HrDivisionTblDto;
import java.util.List;

public interface HrDivisionTblService {
    HrDivisionTblDto getHrDivisionById(Integer id);
    List<HrDivisionTblDto> getAllHrDivisions();
}
