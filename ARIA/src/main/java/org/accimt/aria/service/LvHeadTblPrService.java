package org.accimt.aria.service;

import org.accimt.aria.dto.LvHeadTblPrDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LvHeadTblPrService {
    LvHeadTblPrDto getLvHeadTblPrById(Integer id);
    List<LvHeadTblPrDto> getAllLvHeadTblPrs();
}
