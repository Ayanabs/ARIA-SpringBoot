package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrStoresTblDto;
import org.accimt.aria.entity.HrStoresTbl;
import org.accimt.aria.mapping.HrStoresTblMapping;
import org.accimt.aria.repository.HrStoresTblRepository;
import org.accimt.aria.service.HrStoresTblService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrStoresTblServiceImpl implements HrStoresTblService {

    private final HrStoresTblRepository hrStoresTblRepository;
    private final HrStoresTblMapping hrStoresTblMapping;

    @Override
    public HrStoresTblDto getHrStoresTblById(Integer id) {
        HrStoresTbl hrStoresTbl = hrStoresTblRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HrStoresTbl not found with id: " + id));
        return hrStoresTblMapping.toDto(hrStoresTbl);
    }

    @Override
    public List<HrStoresTblDto> getAllHrStoresTbls() {
        return hrStoresTblRepository.findAll().stream()
                .map(hrStoresTblMapping::toDto)
                .collect(Collectors.toList());
    }
}
