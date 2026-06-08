package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrProjectApcodeDto;
import org.accimt.aria.service.PrProjectApcodeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pr-project-ap-codes")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class PrProjectApcodeController {

    private final PrProjectApcodeService prProjectApcodeService;

    @GetMapping
    public ResponseEntity<List<PrProjectApcodeDto>> getAllPrProjectApcodes() {
        return ResponseEntity.ok(prProjectApcodeService.getAllPrProjectApcodes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrProjectApcodeDto> getPrProjectApcodeById(@PathVariable Integer id) {
        return ResponseEntity.ok(prProjectApcodeService.getPrProjectApcodeById(id));
    }
}
