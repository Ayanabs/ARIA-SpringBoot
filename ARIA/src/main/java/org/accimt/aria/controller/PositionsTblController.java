package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PositionsTblDto;
import org.accimt.aria.service.PositionsTblService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/positions")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class PositionsTblController {

    private final PositionsTblService positionsTblService;

    @GetMapping
    public ResponseEntity<List<PositionsTblDto>> getAllPositionsTbls() {
        return ResponseEntity.ok(positionsTblService.getAllPositionsTbls());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PositionsTblDto> getPositionsTblById(@PathVariable Integer id) {
        return ResponseEntity.ok(positionsTblService.getPositionsTblById(id));
    }
}
