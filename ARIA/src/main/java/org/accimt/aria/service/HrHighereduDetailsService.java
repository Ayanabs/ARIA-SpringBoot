package org.accimt.aria.service;

import org.accimt.aria.dto.HrHighereduDetailsDto;
import java.util.List;

public interface HrHighereduDetailsService {
    HrHighereduDetailsDto getHrHighereduDetailsById(Integer id);
    List<HrHighereduDetailsDto> getAllHrHighereduDetails();
}
