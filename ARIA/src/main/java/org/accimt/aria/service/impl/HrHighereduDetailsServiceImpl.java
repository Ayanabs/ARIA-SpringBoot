package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrHighereduDetailsDto;
import org.accimt.aria.entity.HrHighereduDetails;
import org.accimt.aria.mapping.HrHighereduDetailsMapping;
import org.accimt.aria.repository.HrHighereduDetailsRepository;
import org.accimt.aria.service.HrHighereduDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrHighereduDetailsServiceImpl implements HrHighereduDetailsService {

    private final HrHighereduDetailsRepository hrHighereduDetailsRepository;
    private final HrHighereduDetailsMapping hrHighereduDetailsMapping;

    @Override
    public HrHighereduDetailsDto getHrHighereduDetailsById(Integer id) {
        HrHighereduDetails entity = hrHighereduDetailsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HrHighereduDetails not found with id: " + id));
        return hrHighereduDetailsMapping.toDto(entity);
    }

    @Override
    public List<HrHighereduDetailsDto> getAllHrHighereduDetails() {
        return hrHighereduDetailsRepository.findAll().stream()
                .map(hrHighereduDetailsMapping::toDto)
                .collect(Collectors.toList());
    }
}
