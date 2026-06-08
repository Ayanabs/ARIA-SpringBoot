package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.LvHeadTblPrDto;
import org.accimt.aria.entity.LvHeadTblPr;
import org.accimt.aria.mapping.LvHeadTblPrMapping;
import org.accimt.aria.repository.LvHeadTblPrRepository;
import org.accimt.aria.service.LvHeadTblPrService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class LvHeadTblPrServiceImpl implements LvHeadTblPrService {

    private final LvHeadTblPrRepository lvHeadTblPrRepository;
    private final LvHeadTblPrMapping lvHeadTblPrMapping;

    @Override
    public LvHeadTblPrDto getLvHeadTblPrById(Integer id) {
        LvHeadTblPr entity = lvHeadTblPrRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("LvHeadTblPr not found with id: " + id));
        return lvHeadTblPrMapping.toDto(entity);
    }

    @Override
    public List<LvHeadTblPrDto> getAllLvHeadTblPrs() {
        return lvHeadTblPrRepository.findAll().stream()
                .map(lvHeadTblPrMapping::toDto)
                .collect(Collectors.toList());
    }
}
