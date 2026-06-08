package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrEduLevelsDesDto;
import org.accimt.aria.entity.HrEduLevelsDes;
import org.accimt.aria.mapping.HrEduLevelsDesMapping;
import org.accimt.aria.repository.HrEduLevelsDesRepository;
import org.accimt.aria.service.HrEduLevelsDesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrEduLevelsDesServiceImpl implements HrEduLevelsDesService {

    private final HrEduLevelsDesRepository hrEduLevelsDesRepository;
    private final HrEduLevelsDesMapping hrEduLevelsDesMapping;

    @Override
    public HrEduLevelsDesDto getHrEduLevelsDesById(Integer id) {
        HrEduLevelsDes entity = hrEduLevelsDesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HrEduLevelsDes not found with id: " + id));
        return hrEduLevelsDesMapping.toDto(entity);
    }

    @Override
    public List<HrEduLevelsDesDto> getAllHrEduLevelsDes() {
        return hrEduLevelsDesRepository.findAll().stream()
                .map(hrEduLevelsDesMapping::toDto)
                .collect(Collectors.toList());
    }
}
