package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrDesignationTblDto;
import org.accimt.aria.entity.HrDesignationTbl;
import org.accimt.aria.mapping.HrDesignationTblMapping;
import org.accimt.aria.repository.HrDesignationTblRepository;
import org.accimt.aria.service.HrDesignationTblService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrDesignationTblServiceImpl implements HrDesignationTblService {

    private final HrDesignationTblRepository hrDesignationTblRepository;
    private final HrDesignationTblMapping hrDesignationTblMapping;

    @Override
    public HrDesignationTblDto getHrDesignationById(Integer id) {
        HrDesignationTbl entity = hrDesignationTblRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HrDesignationTbl not found with code: " + id));
        return hrDesignationTblMapping.toDto(entity);
    }

    @Override
    public List<HrDesignationTblDto> getAllHrDesignations() {
        return hrDesignationTblRepository.findAll().stream()
                .map(hrDesignationTblMapping::toDto)
                .collect(Collectors.toList());
    }
}
