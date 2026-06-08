package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrPersonalDetailsDto;
import org.accimt.aria.entity.HrPersonalDetails;
import org.accimt.aria.mapping.HrPersonalDetailsMapping;
import org.accimt.aria.repository.HrPersonalDetailsRepository;
import org.accimt.aria.service.HrPersonalDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrPersonalDetailsServiceImpl implements HrPersonalDetailsService {

    private final HrPersonalDetailsRepository hrPersonalDetailsRepository;
    private final HrPersonalDetailsMapping hrPersonalDetailsMapping;

    @Override
    public HrPersonalDetailsDto getHrPersonalDetailsByEmpNo(Integer empNo) {
        HrPersonalDetails entity = hrPersonalDetailsRepository.findById(empNo)
                .orElseThrow(() -> new RuntimeException("HrPersonalDetails not found with empNo: " + empNo));
        return hrPersonalDetailsMapping.toDto(entity);
    }

    @Override
    public List<HrPersonalDetailsDto> getAllHrPersonalDetails() {
        return hrPersonalDetailsRepository.findAll().stream()
                .map(hrPersonalDetailsMapping::toDto)
                .collect(Collectors.toList());
    }
}
