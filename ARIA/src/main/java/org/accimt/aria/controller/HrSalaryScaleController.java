package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrSalaryScaleDto;
import org.accimt.aria.service.HrSalaryScaleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-salary-scales")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrSalaryScaleController {

    private final HrSalaryScaleService hrSalaryScaleService;

    @GetMapping
    public ResponseEntity<List<HrSalaryScaleDto>> getAllHrSalaryScales() {
        return ResponseEntity.ok(hrSalaryScaleService.getAllHrSalaryScales());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrSalaryScaleDto> getHrSalaryScaleById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrSalaryScaleService.getHrSalaryScaleById(id));
    }
}
