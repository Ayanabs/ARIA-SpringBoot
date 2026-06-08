package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrClosedDto;
import org.accimt.aria.entity.PrClosed;
import org.accimt.aria.mapping.PrClosedMapping;
import org.accimt.aria.repository.PrClosedRepository;
import org.accimt.aria.service.PrClosedService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PrClosedServiceImpl implements PrClosedService {

    private final PrClosedRepository prClosedRepository;
    private final PrClosedMapping prClosedMapping;

    @Override
    public PrClosedDto getPrClosedById(Integer id) {
        PrClosed entity = prClosedRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("PrClosed not found with id: " + id));
        return prClosedMapping.toDto(entity);
    }

    @Override
    public List<PrClosedDto> getAllPrCloseds() {
        return prClosedRepository.findAll().stream()
                .map(prClosedMapping::toDto)
                .collect(Collectors.toList());
    }
}
