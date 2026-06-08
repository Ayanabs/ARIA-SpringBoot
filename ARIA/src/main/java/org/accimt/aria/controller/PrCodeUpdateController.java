package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrCodeUpdateDto;
import org.accimt.aria.service.PrCodeUpdateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pr-code-updates")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class PrCodeUpdateController {

    private final PrCodeUpdateService prCodeUpdateService;

    @GetMapping
    public ResponseEntity<List<PrCodeUpdateDto>> getAllPrCodeUpdates() {
        return ResponseEntity.ok(prCodeUpdateService.getAllPrCodeUpdates());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrCodeUpdateDto> getPrCodeUpdateById(@PathVariable Integer id) {
        return ResponseEntity.ok(prCodeUpdateService.getPrCodeUpdateById(id));
    }
}
