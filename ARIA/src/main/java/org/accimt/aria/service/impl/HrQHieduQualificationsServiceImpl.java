package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQHieduQualificationsDto;
import org.accimt.aria.entity.HrQHieduQualifications;
import org.accimt.aria.mapping.HrQHieduQualificationsMapping;
import org.accimt.aria.repository.HrQHieduQualificationsRepository;
import org.accimt.aria.service.HrQHieduQualificationsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrQHieduQualificationsServiceImpl implements HrQHieduQualificationsService {

    private final HrQHieduQualificationsRepository hrQHieduQualificationsRepository;
    private final HrQHieduQualificationsMapping hrQHieduQualificationsMapping;

    @Override
    public HrQHieduQualificationsDto getHrQHieduQualificationsById(Integer id) {
        HrQHieduQualifications entity = hrQHieduQualificationsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HrQHieduQualifications not found with id: " + id));
        return hrQHieduQualificationsMapping.toDto(entity);
    }

    @Override
    public List<HrQHieduQualificationsDto> getAllHrQHieduQualifications() {
        return hrQHieduQualificationsRepository.findAll().stream()
                .map(hrQHieduQualificationsMapping::toDto)
                .collect(Collectors.toList());
    }
}
