package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrPastEndDto;
import org.accimt.aria.entity.PrPastEnd;
import org.accimt.aria.exception.ResourceNotFoundException;
import org.accimt.aria.mapping.PrPastEndMapping;
import org.accimt.aria.repository.PrPastEndRepository;
import org.accimt.aria.service.PrPastEndService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PrPastEndServiceImpl implements PrPastEndService {

    private final PrPastEndRepository prPastEndRepository;
    private final PrPastEndMapping prPastEndMapping;

    @Override
    public PrPastEndDto getPrPastEndById(Integer id) {
        PrPastEnd entity = prPastEndRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("PrPastEnd not found with id: " + id));
        return prPastEndMapping.toDto(entity);
    }

    @Override
    public List<PrPastEndDto> getAllPrPastEnds() {
        return prPastEndRepository.findAll().stream()
                .map(prPastEndMapping::toDto)
                .collect(Collectors.toList());
    }
}
