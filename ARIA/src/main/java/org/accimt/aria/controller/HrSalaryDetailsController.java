package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrSalaryDetailsDto;
import org.accimt.aria.service.HrSalaryDetailsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-salary-details")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrSalaryDetailsController {

    private final HrSalaryDetailsService hrSalaryDetailsService;

    @GetMapping
    public ResponseEntity<List<HrSalaryDetailsDto>> getAllHrSalaryDetails() {
        return ResponseEntity.ok(hrSalaryDetailsService.getAllHrSalaryDetails());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrSalaryDetailsDto> getHrSalaryDetailsById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrSalaryDetailsService.getHrSalaryDetailsById(id));
    }
}
