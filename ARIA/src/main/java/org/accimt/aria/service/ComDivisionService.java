package org.accimt.aria.service;

import org.accimt.aria.dto.ComDivisionDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ComDivisionService {
    ComDivisionDto getComDivisionById(Integer id);
    List<ComDivisionDto> getAllComDivisions();
}
