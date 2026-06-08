package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrOfficialDetailsDto;
import org.accimt.aria.entity.HrOfficialDetails;
import org.accimt.aria.mapping.HrOfficialDetailsMapping;
import org.accimt.aria.repository.HrOfficialDetailsRepository;
import org.accimt.aria.service.HrOfficialDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrOfficialDetailsServiceImpl implements HrOfficialDetailsService {

    private final HrOfficialDetailsRepository hrOfficialDetailsRepository;
    private final HrOfficialDetailsMapping hrOfficialDetailsMapping;

    @Override
    public HrOfficialDetailsDto getHrOfficialDetailsByEmpNo(Integer empNo) {
        HrOfficialDetails entity = hrOfficialDetailsRepository.findById(empNo)
                .orElseThrow(() -> new RuntimeException("HrOfficialDetails not found with empNo: " + empNo));
        return hrOfficialDetailsMapping.toDto(entity);
    }

    @Override
    public List<HrOfficialDetailsDto> getAllHrOfficialDetails() {
        return hrOfficialDetailsRepository.findAll().stream()
                .map(hrOfficialDetailsMapping::toDto)
                .collect(Collectors.toList());
    }
}
