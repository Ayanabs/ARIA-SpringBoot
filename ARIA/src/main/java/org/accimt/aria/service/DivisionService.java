package org.accimt.aria.service;

import org.accimt.aria.dto.DivisionDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DivisionService {
    DivisionDto createDivision(DivisionDto dto);
    DivisionDto updateDivision(DivisionDto dto);
    DivisionDto getDivisionById(Integer id);
    List<DivisionDto> getAllDivisions();
    void deleteDivisionById(Integer id);
}
