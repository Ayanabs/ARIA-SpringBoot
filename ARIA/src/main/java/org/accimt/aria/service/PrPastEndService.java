package org.accimt.aria.service;

import org.accimt.aria.dto.PrPastEndDto;
import java.util.List;

public interface PrPastEndService {
    PrPastEndDto getPrPastEndById(Integer id);
    List<PrPastEndDto> getAllPrPastEnds();
}
