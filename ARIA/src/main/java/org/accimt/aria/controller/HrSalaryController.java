package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrSalaryDto;
import org.accimt.aria.service.HrSalaryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salary-scales")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrSalaryController {

    private final HrSalaryService hrSalaryService;

    @GetMapping
    public ResponseEntity<List<HrSalaryDto>> getAllHrSalaries() {
        return ResponseEntity.ok(hrSalaryService.getAllHrSalaries());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrSalaryDto> getHrSalaryById(@PathVariable String id) {
        return ResponseEntity.ok(hrSalaryService.getHrSalaryById(id));
    }
}
