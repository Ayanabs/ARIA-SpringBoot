package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrDivisionTblDto;
import org.accimt.aria.entity.HrDivisionTbl;
import org.accimt.aria.mapping.HrDivisionTblMapping;
import org.accimt.aria.repository.HrDivisionTblRepository;
import org.accimt.aria.service.HrDivisionTblService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrDivisionTblServiceImpl implements HrDivisionTblService {

    private final HrDivisionTblRepository hrDivisionTblRepository;
    private final HrDivisionTblMapping hrDivisionTblMapping;

    @Override
    public HrDivisionTblDto getHrDivisionById(Integer id) {
        HrDivisionTbl entity = hrDivisionTblRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HrDivisionTbl not found with code: " + id));
        return hrDivisionTblMapping.toDto(entity);
    }

    @Override
    public List<HrDivisionTblDto> getAllHrDivisions() {
        return hrDivisionTblRepository.findAll().stream()
                .map(hrDivisionTblMapping::toDto)
                .collect(Collectors.toList());
    }
}
