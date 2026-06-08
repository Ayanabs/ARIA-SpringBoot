package org.accimt.aria.service;

import org.accimt.aria.dto.PrCodeUpdateDto;
import java.util.List;

public interface PrCodeUpdateService {
    PrCodeUpdateDto getPrCodeUpdateById(Integer id);
    List<PrCodeUpdateDto> getAllPrCodeUpdates();
}
