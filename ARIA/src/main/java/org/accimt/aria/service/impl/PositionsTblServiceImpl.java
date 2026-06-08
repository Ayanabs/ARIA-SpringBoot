package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PositionsTblDto;
import org.accimt.aria.entity.PositionsTbl;
import org.accimt.aria.mapping.PositionsTblMapping;
import org.accimt.aria.repository.PositionsTblRepository;
import org.accimt.aria.service.PositionsTblService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PositionsTblServiceImpl implements PositionsTblService {

    private final PositionsTblRepository positionsTblRepository;
    private final PositionsTblMapping positionsTblMapping;

    @Override
    public PositionsTblDto getPositionsTblById(Integer id) {
        PositionsTbl entity = positionsTblRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("PositionsTbl not found with empNo: " + id));
        return positionsTblMapping.toDto(entity);
    }

    @Override
    public List<PositionsTblDto> getAllPositionsTbls() {
        return positionsTblRepository.findAll().stream()
                .map(positionsTblMapping::toDto)
                .collect(Collectors.toList());
    }
}
