package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrProjectTypesDto;
import org.accimt.aria.service.PrProjectTypesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pr-project-types")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class PrProjectTypesController {

    private final PrProjectTypesService prProjectTypesService;

    @GetMapping
    public ResponseEntity<List<PrProjectTypesDto>> getAllPrProjectTypes() {
        return ResponseEntity.ok(prProjectTypesService.getAllPrProjectTypes());
    }

    @GetMapping("/{ptCode}")
    public ResponseEntity<PrProjectTypesDto> getPrProjectTypesById(@PathVariable Integer ptCode) {
        return ResponseEntity.ok(prProjectTypesService.getPrProjectTypesById(ptCode));
    }
}
