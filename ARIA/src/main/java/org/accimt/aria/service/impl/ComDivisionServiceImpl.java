package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.ComDivisionDto;
import org.accimt.aria.entity.ComDivision;
import org.accimt.aria.mapping.ComDivisionMapping;
import org.accimt.aria.repository.ComDivisionRepository;
import org.accimt.aria.service.ComDivisionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ComDivisionServiceImpl implements ComDivisionService {

    private final ComDivisionRepository comDivisionRepository;
    private final ComDivisionMapping comDivisionMapping;

    @Override
    public ComDivisionDto getComDivisionById(Integer id) {
        ComDivision entity = comDivisionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ComDivision not found with id: " + id));
        return comDivisionMapping.toDto(entity);
    }

    @Override
    public List<ComDivisionDto> getAllComDivisions() {
        return comDivisionRepository.findAll().stream()
                .map(comDivisionMapping::toDto)
                .collect(Collectors.toList());
    }
}
