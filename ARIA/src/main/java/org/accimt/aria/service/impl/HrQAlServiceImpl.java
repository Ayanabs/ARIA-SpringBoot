package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQAlDto;
import org.accimt.aria.entity.HrQAl;
import org.accimt.aria.exception.ResourceNotFoundException;
import org.accimt.aria.mapping.HrQAlMapping;
import org.accimt.aria.repository.HrQAlRepository;
import org.accimt.aria.service.HrQAlService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrQAlServiceImpl implements HrQAlService {

    private final HrQAlRepository hrQAlRepository;
    private final HrQAlMapping hrQAlMapping;

    @Override
    public HrQAlDto getHrQAlById(Integer id) {
        HrQAl hrQAl = hrQAlRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("HrQAl not found with id: " + id));
        return hrQAlMapping.toDto(hrQAl);
    }

    @Override
    public List<HrQAlDto> getAllHrQAl() {
        return hrQAlRepository.findAll().stream()
                .map(hrQAlMapping::toDto)
                .collect(Collectors.toList());
    }
}
