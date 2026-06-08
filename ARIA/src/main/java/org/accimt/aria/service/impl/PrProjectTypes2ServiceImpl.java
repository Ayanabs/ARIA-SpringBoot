package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrProjectTypes2Dto;
import org.accimt.aria.entity.PrProjectTypes2;
import org.accimt.aria.mapping.PrProjectTypes2Mapping;
import org.accimt.aria.repository.PrProjectTypes2Repository;
import org.accimt.aria.service.PrProjectTypes2Service;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PrProjectTypes2ServiceImpl implements PrProjectTypes2Service {

    private final PrProjectTypes2Repository prProjectTypes2Repository;
    private final PrProjectTypes2Mapping prProjectTypes2Mapping;

    @Override
    public PrProjectTypes2Dto getPrProjectTypes2ById(Integer id) {
        PrProjectTypes2 entity = prProjectTypes2Repository.findById(id)
                .orElseThrow(() -> new RuntimeException("PrProjectTypes2 not found with id: " + id));
        return prProjectTypes2Mapping.toDto(entity);
    }

    @Override
    public List<PrProjectTypes2Dto> getAllPrProjectTypes2() {
        return prProjectTypes2Repository.findAll().stream()
                .map(prProjectTypes2Mapping::toDto)
                .collect(Collectors.toList());
    }
}
