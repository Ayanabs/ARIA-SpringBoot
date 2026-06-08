package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrStoresTblDto;
import org.accimt.aria.service.PrStoresTblService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pr-stores")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class PrStoresTblController {

    private final PrStoresTblService prStoresTblService;

    @GetMapping
    public ResponseEntity<List<PrStoresTblDto>> getAllPrStoresTbl() {
        return ResponseEntity.ok(prStoresTblService.getAllPrStoresTbl());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrStoresTblDto> getPrStoresTblById(@PathVariable Integer id) {
        return ResponseEntity.ok(prStoresTblService.getPrStoresTblById(id));
    }
}
