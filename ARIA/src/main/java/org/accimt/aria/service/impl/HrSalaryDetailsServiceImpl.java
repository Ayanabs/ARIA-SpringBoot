package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrSalaryDetailsDto;
import org.accimt.aria.entity.HrSalaryDetails;
import org.accimt.aria.exception.ResourceNotFoundException;
import org.accimt.aria.mapping.HrSalaryDetailsMapping;
import org.accimt.aria.repository.HrSalaryDetailsRepository;
import org.accimt.aria.service.HrSalaryDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrSalaryDetailsServiceImpl implements HrSalaryDetailsService {

    private final HrSalaryDetailsRepository hrSalaryDetailsRepository;
    private final HrSalaryDetailsMapping hrSalaryDetailsMapping;

    @Override
    public HrSalaryDetailsDto getHrSalaryDetailsById(Integer id) {
        HrSalaryDetails hrSalaryDetails = hrSalaryDetailsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("HrSalaryDetails not found with id: " + id));
        return hrSalaryDetailsMapping.toDto(hrSalaryDetails);
    }

    @Override
    public List<HrSalaryDetailsDto> getAllHrSalaryDetails() {
        return hrSalaryDetailsRepository.findAll().stream()
                .map(hrSalaryDetailsMapping::toDto)
                .collect(Collectors.toList());
    }
}
