package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrDivisionTblDto;
import org.accimt.aria.service.HrDivisionTblService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-divisions")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrDivisionTblController {

    private final HrDivisionTblService hrDivisionTblService;

    @GetMapping
    public ResponseEntity<List<HrDivisionTblDto>> getAllHrDivisions() {
        return ResponseEntity.ok(hrDivisionTblService.getAllHrDivisions());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrDivisionTblDto> getHrDivisionById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrDivisionTblService.getHrDivisionById(id));
    }
}
