package org.accimt.aria.service;

import org.accimt.aria.dto.PrProjectApcodeDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PrProjectApcodeService {

    PrProjectApcodeDto getPrProjectApcodeById(Integer id);
    List<PrProjectApcodeDto> getAllPrProjectApcodes();

}
