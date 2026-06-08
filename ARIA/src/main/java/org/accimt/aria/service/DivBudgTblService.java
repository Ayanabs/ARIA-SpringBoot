package org.accimt.aria.service;

import org.accimt.aria.dto.DivBudgTblDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DivBudgTblService {
    DivBudgTblDto getDivBudgById(Integer id);
    List<DivBudgTblDto> getAllDivBudgs();
}
