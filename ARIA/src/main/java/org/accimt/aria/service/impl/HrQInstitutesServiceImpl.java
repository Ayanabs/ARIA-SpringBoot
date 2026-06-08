package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQInstitutesDto;
import org.accimt.aria.entity.HrQInstitutes;
import org.accimt.aria.mapping.HrQInstitutesMapping;
import org.accimt.aria.repository.HrQInstitutesRepository;
import org.accimt.aria.service.HrQInstitutesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrQInstitutesServiceImpl implements HrQInstitutesService {

    private final HrQInstitutesRepository hrQInstitutesRepository;
    private final HrQInstitutesMapping hrQInstitutesMapping;

    @Override
    public HrQInstitutesDto getHrQInstitutesById(Integer id) {
        HrQInstitutes entity = hrQInstitutesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HrQInstitutes not found with id: " + id));
        return hrQInstitutesMapping.toDto(entity);
    }

    @Override
    public List<HrQInstitutesDto> getAllHrQInstitutes() {
        return hrQInstitutesRepository.findAll().stream()
                .map(hrQInstitutesMapping::toDto)
                .collect(Collectors.toList());
    }
}
