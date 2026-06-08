package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrStoresTblDto;
import org.accimt.aria.entity.PrStoresTbl;
import org.accimt.aria.mapping.PrStoresTblMapping;
import org.accimt.aria.repository.PrStoresTblRepository;
import org.accimt.aria.service.PrStoresTblService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PrStoresTblServiceImpl implements PrStoresTblService {

    private final PrStoresTblRepository prStoresTblRepository;
    private final PrStoresTblMapping prStoresTblMapping;

    @Override
    public PrStoresTblDto getPrStoresTblById(Integer id) {
        PrStoresTbl entity = prStoresTblRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("PrStoresTbl not found with id: " + id));
        return prStoresTblMapping.toDto(entity);
    }

    @Override
    public List<PrStoresTblDto> getAllPrStoresTbl() {
        return prStoresTblRepository.findAll().stream()
                .map(prStoresTblMapping::toDto)
                .collect(Collectors.toList());
    }
}
