package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrSalaryScaleDetailsDto;
import org.accimt.aria.service.HrSalaryScaleDetailsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-salary-scale-details")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrSalaryScaleDetailsController {

    private final HrSalaryScaleDetailsService hrSalaryScaleDetailsService;

    @GetMapping
    public ResponseEntity<List<HrSalaryScaleDetailsDto>> getAllHrSalaryScaleDetails() {
        return ResponseEntity.ok(hrSalaryScaleDetailsService.getAllHrSalaryScaleDetails());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrSalaryScaleDetailsDto> getHrSalaryScaleDetailsById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrSalaryScaleDetailsService.getHrSalaryScaleDetailsById(id));
    }
}
