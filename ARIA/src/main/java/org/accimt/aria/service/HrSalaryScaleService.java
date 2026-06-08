package org.accimt.aria.service;

import org.accimt.aria.dto.HrSalaryScaleDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HrSalaryScaleService {
    HrSalaryScaleDto getHrSalaryScaleById(Integer id);
    List<HrSalaryScaleDto> getAllHrSalaryScales();
}
