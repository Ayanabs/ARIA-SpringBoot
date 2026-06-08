package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrClosedDto;
import org.accimt.aria.service.PrClosedService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pr-closed")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class PrClosedController {

    private final PrClosedService prClosedService;

    @GetMapping
    public ResponseEntity<List<PrClosedDto>> getAllPrCloseds() {
        return ResponseEntity.ok(prClosedService.getAllPrCloseds());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrClosedDto> getPrClosedById(@PathVariable Integer id) {
        return ResponseEntity.ok(prClosedService.getPrClosedById(id));
    }
}
