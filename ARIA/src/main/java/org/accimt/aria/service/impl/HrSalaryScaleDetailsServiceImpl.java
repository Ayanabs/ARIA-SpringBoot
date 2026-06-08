package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrSalaryScaleDetailsDto;
import org.accimt.aria.entity.HrSalaryScaleDetails;
import org.accimt.aria.exception.ResourceNotFoundException;
import org.accimt.aria.mapping.HrSalaryScaleDetailsMapping;
import org.accimt.aria.repository.HrSalaryScaleDetailsRepository;
import org.accimt.aria.service.HrSalaryScaleDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrSalaryScaleDetailsServiceImpl implements HrSalaryScaleDetailsService {

    private final HrSalaryScaleDetailsRepository hrSalaryScaleDetailsRepository;
    private final HrSalaryScaleDetailsMapping hrSalaryScaleDetailsMapping;

    @Override
    public HrSalaryScaleDetailsDto getHrSalaryScaleDetailsById(Integer id) {
        HrSalaryScaleDetails hrSalaryScaleDetails = hrSalaryScaleDetailsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("HrSalaryScaleDetails not found with id: " + id));
        return hrSalaryScaleDetailsMapping.toDto(hrSalaryScaleDetails);
    }

    @Override
    public List<HrSalaryScaleDetailsDto> getAllHrSalaryScaleDetails() {
        return hrSalaryScaleDetailsRepository.findAll().stream()
                .map(hrSalaryScaleDetailsMapping::toDto)
                .collect(Collectors.toList());
    }
}
