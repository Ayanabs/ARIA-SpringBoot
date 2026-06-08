package org.accimt.aria.service;

import org.accimt.aria.dto.PrDenyClosedprjDto;
import java.util.List;

public interface PrDenyClosedprjService {
    PrDenyClosedprjDto getPrDenyClosedprjByPCode(String pCode);
    List<PrDenyClosedprjDto> getAllPrDenyClosedprjs();
}
