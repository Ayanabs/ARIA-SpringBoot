package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrProjectTypesDto;
import org.accimt.aria.entity.PrProjectTypes;
import org.accimt.aria.mapping.PrProjectTypesMapping;
import org.accimt.aria.repository.PrProjectTypesRepository;
import org.accimt.aria.service.PrProjectTypesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PrProjectTypesServiceImpl implements PrProjectTypesService {

    private final PrProjectTypesRepository prProjectTypesRepository;
    private final PrProjectTypesMapping prProjectTypesMapping;

    @Override
    public PrProjectTypesDto getPrProjectTypesById(Integer ptCode) {
        PrProjectTypes prProjectTypes = prProjectTypesRepository.findById(ptCode)
                .orElseThrow(() -> new RuntimeException("PrProjectTypes not found with ptCode: " + ptCode));
        return prProjectTypesMapping.toDto(prProjectTypes);
    }

    @Override
    public List<PrProjectTypesDto> getAllPrProjectTypes() {
        return prProjectTypesRepository.findAll().stream()
                .map(prProjectTypesMapping::toDto)
                .collect(Collectors.toList());
    }
}
