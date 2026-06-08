package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQOlDto;
import org.accimt.aria.entity.HrQOl;
import org.accimt.aria.mapping.HrQOlMapping;
import org.accimt.aria.repository.HrQOlRepository;
import org.accimt.aria.service.HrQOlService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrQOlServiceImpl implements HrQOlService {

    private final HrQOlRepository hrQOlRepository;
    private final HrQOlMapping hrQOlMapping;

    @Override
    public HrQOlDto getHrQOlById(Integer id) {
        HrQOl entity = hrQOlRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HrQOl not found with id: " + id));
        return hrQOlMapping.toDto(entity);
    }

    @Override
    public List<HrQOlDto> getAllHrQOls() {
        return hrQOlRepository.findAll().stream()
                .map(hrQOlMapping::toDto)
                .collect(Collectors.toList());
    }
}
