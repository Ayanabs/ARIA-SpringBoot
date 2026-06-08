package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrDenyClosedprjDto;
import org.accimt.aria.entity.PrDenyClosedprj;
import org.accimt.aria.exception.ResourceNotFoundException;
import org.accimt.aria.mapping.PrDenyClosedprjMapping;
import org.accimt.aria.repository.PrDenyClosedprjRepository;
import org.accimt.aria.service.PrDenyClosedprjService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PrDenyClosedprjServiceImpl implements PrDenyClosedprjService {

    private final PrDenyClosedprjRepository prDenyClosedprjRepository;
    private final PrDenyClosedprjMapping prDenyClosedprjMapping;

    @Override
    public PrDenyClosedprjDto getPrDenyClosedprjByPCode(String pCode) {
        PrDenyClosedprj entity = prDenyClosedprjRepository.findById(pCode)
                .orElseThrow(() -> new ResourceNotFoundException("PrDenyClosedprj not found with pCode: " + pCode));
        return prDenyClosedprjMapping.toDto(entity);
    }

    @Override
    public List<PrDenyClosedprjDto> getAllPrDenyClosedprjs() {
        return prDenyClosedprjRepository.findAll().stream()
                .map(prDenyClosedprjMapping::toDto)
                .collect(Collectors.toList());
    }
}
