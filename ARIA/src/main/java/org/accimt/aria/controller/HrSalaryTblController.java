package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrSalaryTblDto;
import org.accimt.aria.service.HrSalaryTblService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-salary-table")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrSalaryTblController {

    private final HrSalaryTblService hrSalaryTblService;

    @GetMapping
    public ResponseEntity<List<HrSalaryTblDto>> getAllHrSalaryTbls() {
        return ResponseEntity.ok(hrSalaryTblService.getAllHrSalaryTbls());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrSalaryTblDto> getHrSalaryTblById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrSalaryTblService.getHrSalaryTblById(id));
    }
}
