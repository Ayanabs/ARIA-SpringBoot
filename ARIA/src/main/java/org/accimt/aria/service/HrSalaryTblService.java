package org.accimt.aria.service;

import org.accimt.aria.dto.HrSalaryTblDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HrSalaryTblService {
    HrSalaryTblDto getHrSalaryTblById(Integer id);
    List<HrSalaryTblDto> getAllHrSalaryTbls();
}
