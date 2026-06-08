package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrProjectDetailsDto;
import org.accimt.aria.entity.HrProjectDetails;
import org.accimt.aria.mapping.HrProjectDetailsMapping;
import org.accimt.aria.repository.HrProjectDetailsRepository;
import org.accimt.aria.service.HrProjectDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrProjectDetailsServiceImpl implements HrProjectDetailsService {

    private final HrProjectDetailsRepository hrProjectDetailsRepository;
    private final HrProjectDetailsMapping hrProjectDetailsMapping;

    @Override
    public HrProjectDetailsDto getHrProjectDetailsBySerialNo(Integer serialNo) {
        HrProjectDetails entity = hrProjectDetailsRepository.findById(serialNo)
                .orElseThrow(() -> new RuntimeException("HrProjectDetails not found with serialNo: " + serialNo));
        return hrProjectDetailsMapping.toDto(entity);
    }

    @Override
    public List<HrProjectDetailsDto> getAllHrProjectDetails() {
        return hrProjectDetailsRepository.findAll().stream()
                .map(hrProjectDetailsMapping::toDto)
                .collect(Collectors.toList());
    }
}
