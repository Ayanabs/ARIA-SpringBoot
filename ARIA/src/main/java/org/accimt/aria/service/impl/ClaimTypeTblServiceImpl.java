package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.ClaimTypeTblDto;
import org.accimt.aria.entity.ClaimTypeTbl;
import org.accimt.aria.mapping.ClaimTypeTblMapping;
import org.accimt.aria.repository.ClaimTypeTblRepository;
import org.accimt.aria.service.ClaimTypeTblService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ClaimTypeTblServiceImpl implements ClaimTypeTblService {

    private final ClaimTypeTblRepository claimTypeTblRepository;
    private final ClaimTypeTblMapping claimTypeTblMapping;

    @Override
    public ClaimTypeTblDto getClaimTypeById(Integer id) {
        ClaimTypeTbl entity = claimTypeTblRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ClaimTypeTbl not found with id: " + id));
        return claimTypeTblMapping.toDto(entity);
    }

    @Override
    public List<ClaimTypeTblDto> getAllClaimTypes() {
        return claimTypeTblRepository.findAll().stream()
                .map(claimTypeTblMapping::toDto)
                .collect(Collectors.toList());
    }
}
