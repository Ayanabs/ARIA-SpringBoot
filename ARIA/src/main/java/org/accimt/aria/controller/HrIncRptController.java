package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrIncRptDto;
import org.accimt.aria.service.HrIncRptService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-increment-reports")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrIncRptController {

    private final HrIncRptService hrIncRptService;

    @GetMapping
    public ResponseEntity<List<HrIncRptDto>> getAllHrIncRpts() {
        return ResponseEntity.ok(hrIncRptService.getAllHrIncRpts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrIncRptDto> getHrIncRptById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrIncRptService.getHrIncRptById(id));
    }
}
