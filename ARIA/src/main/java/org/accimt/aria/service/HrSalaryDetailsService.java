package org.accimt.aria.service;

import org.accimt.aria.dto.HrSalaryDetailsDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HrSalaryDetailsService {
    HrSalaryDetailsDto getHrSalaryDetailsById(Integer id);
    List<HrSalaryDetailsDto> getAllHrSalaryDetails();
}
