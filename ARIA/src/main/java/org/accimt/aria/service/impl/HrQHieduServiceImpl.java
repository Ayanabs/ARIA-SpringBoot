package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQHieduDto;
import org.accimt.aria.entity.HrQHiedu;
import org.accimt.aria.mapping.HrQHieduMapping;
import org.accimt.aria.repository.HrQHieduRepository;
import org.accimt.aria.service.HrQHieduService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrQHieduServiceImpl implements HrQHieduService {

    private final HrQHieduRepository hrQHieduRepository;
    private final HrQHieduMapping hrQHieduMapping;

    @Override
    public HrQHieduDto getHrQHieduById(Integer id) {
        HrQHiedu entity = hrQHieduRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HrQHiedu not found with id: " + id));
        return hrQHieduMapping.toDto(entity);
    }

    @Override
    public List<HrQHieduDto> getAllHrQHiedus() {
        return hrQHieduRepository.findAll().stream()
                .map(hrQHieduMapping::toDto)
                .collect(Collectors.toList());
    }
}
