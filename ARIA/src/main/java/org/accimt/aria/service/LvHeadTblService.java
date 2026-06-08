package org.accimt.aria.service;

import org.accimt.aria.dto.LvHeadTblDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LvHeadTblService {
    LvHeadTblDto getLvHeadTblById(Integer id);
    List<LvHeadTblDto> getAllLvHeadTbls();
}
