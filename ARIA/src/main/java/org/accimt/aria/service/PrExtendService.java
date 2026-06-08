package org.accimt.aria.service;

import org.accimt.aria.dto.PrExtendDto;
import java.util.List;

public interface PrExtendService {
    PrExtendDto getPrExtendById(Integer id);
    List<PrExtendDto> getAllPrExtends();
}
