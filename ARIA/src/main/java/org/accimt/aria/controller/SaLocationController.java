package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.SaLocationDto;
import org.accimt.aria.service.SaLocationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sa-locations")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class SaLocationController {

    private final SaLocationService saLocationService;

    @GetMapping
    public ResponseEntity<List<SaLocationDto>> getAllSaLocations() {
        return ResponseEntity.ok(saLocationService.getAllSaLocations());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SaLocationDto> getSaLocationById(@PathVariable Integer id) {
        return ResponseEntity.ok(saLocationService.getSaLocationById(id));
    }
}
