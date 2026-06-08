package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrExtendDto;
import org.accimt.aria.entity.PrExtend;
import org.accimt.aria.exception.ResourceNotFoundException;
import org.accimt.aria.mapping.PrExtendMapping;
import org.accimt.aria.repository.PrExtendRepository;
import org.accimt.aria.service.PrExtendService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PrExtendServiceImpl implements PrExtendService {

    private final PrExtendRepository prExtendRepository;
    private final PrExtendMapping prExtendMapping;

    @Override
    public PrExtendDto getPrExtendById(Integer id) {
        PrExtend entity = prExtendRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("PrExtend not found with id: " + id));
        return prExtendMapping.toDto(entity);
    }

    @Override
    public List<PrExtendDto> getAllPrExtends() {
        return prExtendRepository.findAll().stream()
                .map(prExtendMapping::toDto)
                .collect(Collectors.toList());
    }
}
