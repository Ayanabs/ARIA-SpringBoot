package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.LvDtsTblDto;
import org.accimt.aria.entity.LvDtsTbl;
import org.accimt.aria.mapping.LvDtsTblMapping;
import org.accimt.aria.repository.LvDtsTblRepository;
import org.accimt.aria.service.LvDtsTblService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class LvDtsTblServiceImpl implements LvDtsTblService {

    private final LvDtsTblRepository lvDtsTblRepository;
    private final LvDtsTblMapping lvDtsTblMapping;

    @Override
    public LvDtsTblDto getLvDtsTblById(Integer id) {
        LvDtsTbl lvDtsTbl = lvDtsTblRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("LvDtsTbl not found with id: " + id));
        return lvDtsTblMapping.toDto(lvDtsTbl);
    }

    @Override
    public List<LvDtsTblDto> getAllLvDtsTbls() {
        return lvDtsTblRepository.findAll().stream()
                .map(lvDtsTblMapping::toDto)
                .collect(Collectors.toList());
    }
}
