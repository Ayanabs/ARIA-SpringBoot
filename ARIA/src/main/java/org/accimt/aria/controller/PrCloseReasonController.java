package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrCloseReasonDto;
import org.accimt.aria.service.PrCloseReasonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pr-close-reasons")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class PrCloseReasonController {

    private final PrCloseReasonService prCloseReasonService;

    @GetMapping
    public ResponseEntity<List<PrCloseReasonDto>> getAllPrCloseReasons() {
        return ResponseEntity.ok(prCloseReasonService.getAllPrCloseReasons());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrCloseReasonDto> getPrCloseReasonById(@PathVariable Integer id) {
        return ResponseEntity.ok(prCloseReasonService.getPrCloseReasonById(id));
    }
}
