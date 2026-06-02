package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.DivisionDto;
import org.accimt.aria.service.DivisionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/divisions")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class DivisionController {

    private final DivisionService divisionService;

    @GetMapping
    public ResponseEntity<List<DivisionDto>> getAllDivisions() {
        return ResponseEntity.ok(divisionService.getAllDivisions());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DivisionDto> getDivisionById(@PathVariable Integer id) {
        return ResponseEntity.ok(divisionService.getDivisionById(id));
    }
}
