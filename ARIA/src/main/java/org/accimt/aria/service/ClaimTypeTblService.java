package org.accimt.aria.service;

import org.accimt.aria.dto.ClaimTypeTblDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClaimTypeTblService {
    ClaimTypeTblDto getClaimTypeById(Integer id);
    List<ClaimTypeTblDto> getAllClaimTypes();
}
