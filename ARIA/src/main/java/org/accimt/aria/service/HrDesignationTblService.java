package org.accimt.aria.service;

import org.accimt.aria.dto.HrDesignationTblDto;
import java.util.List;

public interface HrDesignationTblService {
    HrDesignationTblDto getHrDesignationById(Integer id);
    List<HrDesignationTblDto> getAllHrDesignations();
}
