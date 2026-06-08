package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.LvHeadTblDto;
import org.accimt.aria.entity.LvHeadTbl;
import org.accimt.aria.mapping.LvHeadTblMapping;
import org.accimt.aria.repository.LvHeadTblRepository;
import org.accimt.aria.service.LvHeadTblService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class LvHeadTblServiceImpl implements LvHeadTblService {

    private final LvHeadTblRepository lvHeadTblRepository;
    private final LvHeadTblMapping lvHeadTblMapping;

    @Override
    public LvHeadTblDto getLvHeadTblById(Integer id) {
        LvHeadTbl entity = lvHeadTblRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("LvHeadTbl not found with id: " + id));
        return lvHeadTblMapping.toDto(entity);
    }

    @Override
    public List<LvHeadTblDto> getAllLvHeadTbls() {
        return lvHeadTblRepository.findAll().stream()
                .map(lvHeadTblMapping::toDto)
                .collect(Collectors.toList());
    }
}
