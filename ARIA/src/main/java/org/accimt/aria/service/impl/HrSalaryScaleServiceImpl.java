package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrSalaryScaleDto;
import org.accimt.aria.entity.HrSalaryScale;
import org.accimt.aria.exception.ResourceNotFoundException;
import org.accimt.aria.mapping.HrSalaryScaleMapping;
import org.accimt.aria.repository.HrSalaryScaleRepository;
import org.accimt.aria.service.HrSalaryScaleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrSalaryScaleServiceImpl implements HrSalaryScaleService {

    private final HrSalaryScaleRepository hrSalaryScaleRepository;
    private final HrSalaryScaleMapping hrSalaryScaleMapping;

    @Override
    public HrSalaryScaleDto getHrSalaryScaleById(Integer id) {
        HrSalaryScale hrSalaryScale = hrSalaryScaleRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("HrSalaryScale not found with id: " + id));
        return hrSalaryScaleMapping.toDto(hrSalaryScale);
    }

    @Override
    public List<HrSalaryScaleDto> getAllHrSalaryScales() {
        return hrSalaryScaleRepository.findAll().stream()
                .map(hrSalaryScaleMapping::toDto)
                .collect(Collectors.toList());
    }
}
