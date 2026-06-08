package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrSalaryAllDetailsDto;
import org.accimt.aria.entity.HrSalaryAllDetails;
import org.accimt.aria.exception.ResourceNotFoundException;
import org.accimt.aria.mapping.HrSalaryAllDetailsMapping;
import org.accimt.aria.repository.HrSalaryAllDetailsRepository;
import org.accimt.aria.service.HrSalaryAllDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrSalaryAllDetailsServiceImpl implements HrSalaryAllDetailsService {

    private final HrSalaryAllDetailsRepository hrSalaryAllDetailsRepository;
    private final HrSalaryAllDetailsMapping hrSalaryAllDetailsMapping;

    @Override
    public HrSalaryAllDetailsDto getHrSalaryAllDetailsById(Integer id) {
        HrSalaryAllDetails hrSalaryAllDetails = hrSalaryAllDetailsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("HrSalaryAllDetails not found with id: " + id));
        return hrSalaryAllDetailsMapping.toDto(hrSalaryAllDetails);
    }

    @Override
    public List<HrSalaryAllDetailsDto> getAllHrSalaryAllDetails() {
        return hrSalaryAllDetailsRepository.findAll().stream()
                .map(hrSalaryAllDetailsMapping::toDto)
                .collect(Collectors.toList());
    }
}
