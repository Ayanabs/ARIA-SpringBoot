package org.accimt.aria.service;

import org.accimt.aria.dto.PrProjectTypes2Dto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PrProjectTypes2Service {

    PrProjectTypes2Dto getPrProjectTypes2ById(Integer id);
    List<PrProjectTypes2Dto> getAllPrProjectTypes2();

}
