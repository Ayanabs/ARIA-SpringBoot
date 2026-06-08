package org.accimt.aria.service;

import org.accimt.aria.dto.PrStoresTblDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PrStoresTblService {

    PrStoresTblDto getPrStoresTblById(Integer id);
    List<PrStoresTblDto> getAllPrStoresTbl();

}
