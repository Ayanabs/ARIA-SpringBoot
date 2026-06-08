package org.accimt.aria.service;

import org.accimt.aria.dto.HrSalaryDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HrSalaryService {

    HrSalaryDto getHrSalaryById(String id);
    List<HrSalaryDto> getAllHrSalaries();

}
