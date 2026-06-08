package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrSalaryAllDetailsDto;
import org.accimt.aria.service.HrSalaryAllDetailsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-salary-all-details")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrSalaryAllDetailsController {

    private final HrSalaryAllDetailsService hrSalaryAllDetailsService;

    @GetMapping
    public ResponseEntity<List<HrSalaryAllDetailsDto>> getAllHrSalaryAllDetails() {
        return ResponseEntity.ok(hrSalaryAllDetailsService.getAllHrSalaryAllDetails());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrSalaryAllDetailsDto> getHrSalaryAllDetailsById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrSalaryAllDetailsService.getHrSalaryAllDetailsById(id));
    }
}
