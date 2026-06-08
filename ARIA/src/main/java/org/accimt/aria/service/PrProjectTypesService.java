package org.accimt.aria.service;

import org.accimt.aria.dto.PrProjectTypesDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PrProjectTypesService {

    PrProjectTypesDto getPrProjectTypesById(Integer ptCode);
    List<PrProjectTypesDto> getAllPrProjectTypes();

}
