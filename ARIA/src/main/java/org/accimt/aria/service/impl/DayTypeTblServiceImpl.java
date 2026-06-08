package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.DayTypeTblDto;
import org.accimt.aria.entity.DayTypeTbl;
import org.accimt.aria.mapping.DayTypeTblMapping;
import org.accimt.aria.repository.DayTypeTblRepository;
import org.accimt.aria.service.DayTypeTblService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DayTypeTblServiceImpl implements DayTypeTblService {

    private final DayTypeTblRepository dayTypeTblRepository;
    private final DayTypeTblMapping dayTypeTblMapping;

    @Override
    public DayTypeTblDto getDayTypeById(Integer id) {
        DayTypeTbl entity = dayTypeTblRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("DayTypeTbl not found with id: " + id));
        return dayTypeTblMapping.toDto(entity);
    }

    @Override
    public List<DayTypeTblDto> getAllDayTypes() {
        return dayTypeTblRepository.findAll().stream()
                .map(dayTypeTblMapping::toDto)
                .collect(Collectors.toList());
    }
}
