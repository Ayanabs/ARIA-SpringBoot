package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.DayTypeTblDto;
import org.accimt.aria.service.DayTypeTblService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/day-types")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class DayTypeTblController {

    private final DayTypeTblService dayTypeTblService;

    @GetMapping
    public ResponseEntity<List<DayTypeTblDto>> getAllDayTypes() {
        return ResponseEntity.ok(dayTypeTblService.getAllDayTypes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DayTypeTblDto> getDayTypeById(@PathVariable Integer id) {
        return ResponseEntity.ok(dayTypeTblService.getDayTypeById(id));
    }
}
