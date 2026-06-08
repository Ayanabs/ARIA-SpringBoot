package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrProjectApcodeDto;
import org.accimt.aria.entity.PrProjectApcode;
import org.accimt.aria.mapping.PrProjectApcodeMapping;
import org.accimt.aria.repository.PrProjectApcodeRepository;
import org.accimt.aria.service.PrProjectApcodeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PrProjectApcodeServiceImpl implements PrProjectApcodeService {

    private final PrProjectApcodeRepository prProjectApcodeRepository;
    private final PrProjectApcodeMapping prProjectApcodeMapping;

    @Override
    public PrProjectApcodeDto getPrProjectApcodeById(Integer id) {
        PrProjectApcode prProjectApcode = prProjectApcodeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("PrProjectApcode not found with id: " + id));
        return prProjectApcodeMapping.toDto(prProjectApcode);
    }

    @Override
    public List<PrProjectApcodeDto> getAllPrProjectApcodes() {
        return prProjectApcodeRepository.findAll().stream()
                .map(prProjectApcodeMapping::toDto)
                .collect(Collectors.toList());
    }
}
