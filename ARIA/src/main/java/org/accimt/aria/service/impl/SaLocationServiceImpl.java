package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.SaLocationDto;
import org.accimt.aria.entity.SaLocation;
import org.accimt.aria.mapping.SaLocationMapping;
import org.accimt.aria.repository.SaLocationRepository;
import org.accimt.aria.service.SaLocationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SaLocationServiceImpl implements SaLocationService {

    private final SaLocationRepository saLocationRepository;
    private final SaLocationMapping saLocationMapping;

    @Override
    public SaLocationDto getSaLocationById(Integer id) {
        SaLocation entity = saLocationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("SaLocation not found with id: " + id));
        return saLocationMapping.toDto(entity);
    }

    @Override
    public List<SaLocationDto> getAllSaLocations() {
        return saLocationRepository.findAll().stream()
                .map(saLocationMapping::toDto)
                .collect(Collectors.toList());
    }
}
