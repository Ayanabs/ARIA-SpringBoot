package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrChangeHistoryDto;
import org.accimt.aria.entity.PrChangeHistory;
import org.accimt.aria.mapping.PrChangeHistoryMapping;
import org.accimt.aria.repository.PrChangeHistoryRepository;
import org.accimt.aria.service.PrChangeHistoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PrChangeHistoryServiceImpl implements PrChangeHistoryService {

    private final PrChangeHistoryRepository prChangeHistoryRepository;
    private final PrChangeHistoryMapping prChangeHistoryMapping;

    @Override
    public PrChangeHistoryDto getPrChangeHistoryById(Integer id) {
        PrChangeHistory entity = prChangeHistoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("PrChangeHistory not found with id: " + id));
        return prChangeHistoryMapping.toDto(entity);
    }

    @Override
    public List<PrChangeHistoryDto> getAllPrChangeHistories() {
        return prChangeHistoryRepository.findAll().stream()
                .map(prChangeHistoryMapping::toDto)
                .collect(Collectors.toList());
    }
}
