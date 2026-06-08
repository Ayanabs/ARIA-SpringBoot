package org.accimt.aria.service;

import org.accimt.aria.dto.HrSalaryAllDetailsDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HrSalaryAllDetailsService {
    HrSalaryAllDetailsDto getHrSalaryAllDetailsById(Integer id);
    List<HrSalaryAllDetailsDto> getAllHrSalaryAllDetails();
}
