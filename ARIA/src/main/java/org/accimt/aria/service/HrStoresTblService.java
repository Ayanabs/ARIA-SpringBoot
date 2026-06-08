package org.accimt.aria.service;

import org.accimt.aria.dto.HrStoresTblDto;
import java.util.List;

public interface HrStoresTblService {
    HrStoresTblDto getHrStoresTblById(Integer id);
    List<HrStoresTblDto> getAllHrStoresTbls();
}
