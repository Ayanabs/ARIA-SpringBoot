package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.LvActingTblDto;
import org.accimt.aria.entity.LvActingTbl;
import org.accimt.aria.mapping.LvActingTblMapping;
import org.accimt.aria.repository.LvActingTblRepository;
import org.accimt.aria.service.LvActingTblService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class LvActingTblServiceImpl implements LvActingTblService {

    private final LvActingTblRepository lvActingTblRepository;
    private final LvActingTblMapping lvActingTblMapping;

    @Override
    public LvActingTblDto getLvActingTblById(Integer id) {
        LvActingTbl lvActingTbl = lvActingTblRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("LvActingTbl not found with id: " + id));
        return lvActingTblMapping.toDto(lvActingTbl);
    }

    @Override
    public List<LvActingTblDto> getAllLvActingTbls() {
        return lvActingTblRepository.findAll().stream()
                .map(lvActingTblMapping::toDto)
                .collect(Collectors.toList());
    }
}
