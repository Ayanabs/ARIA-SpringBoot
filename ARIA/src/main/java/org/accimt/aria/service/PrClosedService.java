package org.accimt.aria.service;

import org.accimt.aria.dto.PrClosedDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PrClosedService {
    PrClosedDto getPrClosedById(Integer id);
    List<PrClosedDto> getAllPrCloseds();
}
