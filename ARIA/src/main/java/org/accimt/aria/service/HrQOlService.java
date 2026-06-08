package org.accimt.aria.service;

import org.accimt.aria.dto.HrQOlDto;
import java.util.List;

public interface HrQOlService {
    HrQOlDto getHrQOlById(Integer id);
    List<HrQOlDto> getAllHrQOls();
}
