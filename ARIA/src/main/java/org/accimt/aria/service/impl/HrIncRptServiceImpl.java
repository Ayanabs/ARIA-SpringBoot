package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrIncRptDto;
import org.accimt.aria.entity.HrIncRpt;
import org.accimt.aria.mapping.HrIncRptMapping;
import org.accimt.aria.repository.HrIncRptRepository;
import org.accimt.aria.service.HrIncRptService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrIncRptServiceImpl implements HrIncRptService {

    private final HrIncRptRepository hrIncRptRepository;
    private final HrIncRptMapping hrIncRptMapping;

    @Override
    public HrIncRptDto getHrIncRptById(Integer id) {
        HrIncRpt entity = hrIncRptRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HrIncRpt not found with id: " + id));
        return hrIncRptMapping.toDto(entity);
    }

    @Override
    public List<HrIncRptDto> getAllHrIncRpts() {
        return hrIncRptRepository.findAll().stream()
                .map(hrIncRptMapping::toDto)
                .collect(Collectors.toList());
    }
}
