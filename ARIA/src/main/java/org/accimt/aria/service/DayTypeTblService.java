package org.accimt.aria.service;

import org.accimt.aria.dto.DayTypeTblDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DayTypeTblService {
    DayTypeTblDto getDayTypeById(Integer id);
    List<DayTypeTblDto> getAllDayTypes();
}
