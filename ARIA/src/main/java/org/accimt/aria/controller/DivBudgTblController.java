package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.DivBudgTblDto;
import org.accimt.aria.service.DivBudgTblService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/div-budgets")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class DivBudgTblController {

    private final DivBudgTblService divBudgTblService;

    @GetMapping
    public ResponseEntity<List<DivBudgTblDto>> getAllDivBudgs() {
        return ResponseEntity.ok(divBudgTblService.getAllDivBudgs());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DivBudgTblDto> getDivBudgById(@PathVariable Integer id) {
        return ResponseEntity.ok(divBudgTblService.getDivBudgById(id));
    }
}
