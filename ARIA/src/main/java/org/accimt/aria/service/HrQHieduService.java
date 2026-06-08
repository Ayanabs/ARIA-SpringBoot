package org.accimt.aria.service;

import org.accimt.aria.dto.HrQHieduDto;
import java.util.List;

public interface HrQHieduService {
    HrQHieduDto getHrQHieduById(Integer id);
    List<HrQHieduDto> getAllHrQHiedus();
}
