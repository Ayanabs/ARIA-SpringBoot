package org.accimt.aria.service;

import org.accimt.aria.dto.HrQAlsubjectsDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HrQAlsubjectsService {
    HrQAlsubjectsDto getHrQAlsubjectsById(Integer id);
    List<HrQAlsubjectsDto> getAllHrQAlsubjects();
}
