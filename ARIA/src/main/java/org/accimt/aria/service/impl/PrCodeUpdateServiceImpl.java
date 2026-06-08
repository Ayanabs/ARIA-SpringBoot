package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrCodeUpdateDto;
import org.accimt.aria.entity.PrCodeUpdate;
import org.accimt.aria.exception.ResourceNotFoundException;
import org.accimt.aria.mapping.PrCodeUpdateMapping;
import org.accimt.aria.repository.PrCodeUpdateRepository;
import org.accimt.aria.service.PrCodeUpdateService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PrCodeUpdateServiceImpl implements PrCodeUpdateService {

    private final PrCodeUpdateRepository prCodeUpdateRepository;
    private final PrCodeUpdateMapping prCodeUpdateMapping;

    @Override
    public PrCodeUpdateDto getPrCodeUpdateById(Integer id) {
        PrCodeUpdate entity = prCodeUpdateRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("PrCodeUpdate not found with id: " + id));
        return prCodeUpdateMapping.toDto(entity);
    }

    @Override
    public List<PrCodeUpdateDto> getAllPrCodeUpdates() {
        return prCodeUpdateRepository.findAll().stream()
                .map(prCodeUpdateMapping::toDto)
                .collect(Collectors.toList());
    }
}
