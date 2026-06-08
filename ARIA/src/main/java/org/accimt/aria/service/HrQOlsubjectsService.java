package org.accimt.aria.service;

import org.accimt.aria.dto.HrQOlsubjectsDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HrQOlsubjectsService {
    HrQOlsubjectsDto getHrQOlsubjectsById(Integer id);
    List<HrQOlsubjectsDto> getAllHrQOlsubjects();
}
