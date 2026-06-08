package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.IncompleteSourceTblDto;
import org.accimt.aria.entity.IncompleteSourceTbl;
import org.accimt.aria.mapping.IncompleteSourceTblMapping;
import org.accimt.aria.repository.IncompleteSourceTblRepository;
import org.accimt.aria.service.IncompleteSourceTblService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class IncompleteSourceTblServiceImpl implements IncompleteSourceTblService {

    private final IncompleteSourceTblRepository incompleteSourceTblRepository;
    private final IncompleteSourceTblMapping incompleteSourceTblMapping;

    @Override
    public IncompleteSourceTblDto getIncompleteSourceTblById(Integer id) {
        IncompleteSourceTbl incompleteSourceTbl = incompleteSourceTblRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("IncompleteSourceTbl not found with id: " + id));
        return incompleteSourceTblMapping.toDto(incompleteSourceTbl);
    }

    @Override
    public List<IncompleteSourceTblDto> getAllIncompleteSourceTbls() {
        return incompleteSourceTblRepository.findAll().stream()
                .map(incompleteSourceTblMapping::toDto)
                .collect(Collectors.toList());
    }
}
