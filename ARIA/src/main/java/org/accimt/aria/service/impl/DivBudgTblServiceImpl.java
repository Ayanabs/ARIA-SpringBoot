package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.DivBudgTblDto;
import org.accimt.aria.entity.DivBudgTbl;
import org.accimt.aria.mapping.DivBudgTblMapping;
import org.accimt.aria.repository.DivBudgTblRepository;
import org.accimt.aria.service.DivBudgTblService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DivBudgTblServiceImpl implements DivBudgTblService {

    private final DivBudgTblRepository divBudgTblRepository;
    private final DivBudgTblMapping divBudgTblMapping;

    @Override
    public DivBudgTblDto getDivBudgById(Integer id) {
        DivBudgTbl entity = divBudgTblRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("DivBudgTbl not found with id: " + id));
        return divBudgTblMapping.toDto(entity);
    }

    @Override
    public List<DivBudgTblDto> getAllDivBudgs() {
        return divBudgTblRepository.findAll().stream()
                .map(divBudgTblMapping::toDto)
                .collect(Collectors.toList());
    }
}
