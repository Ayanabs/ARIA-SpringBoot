package org.accimt.aria.service;

import org.accimt.aria.dto.HrSalaryScaleDetailsDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HrSalaryScaleDetailsService {
    HrSalaryScaleDetailsDto getHrSalaryScaleDetailsById(Integer id);
    List<HrSalaryScaleDetailsDto> getAllHrSalaryScaleDetails();
}
