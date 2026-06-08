package org.accimt.aria.service;

import org.accimt.aria.dto.MainSubDivisionDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MainSubDivisionService {
    MainSubDivisionDto getMainSubDivisionById(Integer id);
    List<MainSubDivisionDto> getAllMainSubDivisions();
}
