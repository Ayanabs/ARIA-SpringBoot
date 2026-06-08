package org.accimt.aria.service;

import org.accimt.aria.dto.PrCloseReasonDto;
import java.util.List;

public interface PrCloseReasonService {
    PrCloseReasonDto getPrCloseReasonById(Integer id);
    List<PrCloseReasonDto> getAllPrCloseReasons();
}
