package org.accimt.aria.service;

import org.accimt.aria.dto.PositionsTblDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PositionsTblService {
    PositionsTblDto getPositionsTblById(Integer id);
    List<PositionsTblDto> getAllPositionsTbls();
}
