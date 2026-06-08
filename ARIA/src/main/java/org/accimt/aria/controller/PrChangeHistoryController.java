package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrChangeHistoryDto;
import org.accimt.aria.service.PrChangeHistoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pr-change-history")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class PrChangeHistoryController {

    private final PrChangeHistoryService prChangeHistoryService;

    @GetMapping
    public ResponseEntity<List<PrChangeHistoryDto>> getAllPrChangeHistories() {
        return ResponseEntity.ok(prChangeHistoryService.getAllPrChangeHistories());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrChangeHistoryDto> getPrChangeHistoryById(@PathVariable Integer id) {
        return ResponseEntity.ok(prChangeHistoryService.getPrChangeHistoryById(id));
    }
}
