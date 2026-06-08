package org.accimt.aria.service;

import org.accimt.aria.dto.PrChangeHistoryDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PrChangeHistoryService {
    PrChangeHistoryDto getPrChangeHistoryById(Integer id);
    List<PrChangeHistoryDto> getAllPrChangeHistories();
}
