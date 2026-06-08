package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrCloseReasonDto;
import org.accimt.aria.entity.PrCloseReason;
import org.accimt.aria.exception.ResourceNotFoundException;
import org.accimt.aria.mapping.PrCloseReasonMapping;
import org.accimt.aria.repository.PrCloseReasonRepository;
import org.accimt.aria.service.PrCloseReasonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PrCloseReasonServiceImpl implements PrCloseReasonService {

    private final PrCloseReasonRepository prCloseReasonRepository;
    private final PrCloseReasonMapping prCloseReasonMapping;

    @Override
    public PrCloseReasonDto getPrCloseReasonById(Integer id) {
        PrCloseReason entity = prCloseReasonRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("PrCloseReason not found with id: " + id));
        return prCloseReasonMapping.toDto(entity);
    }

    @Override
    public List<PrCloseReasonDto> getAllPrCloseReasons() {
        return prCloseReasonRepository.findAll().stream()
                .map(prCloseReasonMapping::toDto)
                .collect(Collectors.toList());
    }
}
