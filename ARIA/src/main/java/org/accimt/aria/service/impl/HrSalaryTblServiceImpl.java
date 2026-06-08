package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrSalaryTblDto;
import org.accimt.aria.entity.HrSalaryTbl;
import org.accimt.aria.exception.ResourceNotFoundException;
import org.accimt.aria.mapping.HrSalaryTblMapping;
import org.accimt.aria.repository.HrSalaryTblRepository;
import org.accimt.aria.service.HrSalaryTblService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrSalaryTblServiceImpl implements HrSalaryTblService {

    private final HrSalaryTblRepository hrSalaryTblRepository;
    private final HrSalaryTblMapping hrSalaryTblMapping;

    @Override
    public HrSalaryTblDto getHrSalaryTblById(Integer id) {
        HrSalaryTbl hrSalaryTbl = hrSalaryTblRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("HrSalaryTbl not found with id: " + id));
        return hrSalaryTblMapping.toDto(hrSalaryTbl);
    }

    @Override
    public List<HrSalaryTblDto> getAllHrSalaryTbls() {
        return hrSalaryTblRepository.findAll().stream()
                .map(hrSalaryTblMapping::toDto)
                .collect(Collectors.toList());
    }
}
