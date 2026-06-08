package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQGradesDto;
import org.accimt.aria.service.HrQGradesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-q-grades")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrQGradesController {

    private final HrQGradesService hrQGradesService;

    @GetMapping
    public ResponseEntity<List<HrQGradesDto>> getAllHrQGrades() {
        return ResponseEntity.ok(hrQGradesService.getAllHrQGrades());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrQGradesDto> getHrQGradesById(@PathVariable String id) {
        return ResponseEntity.ok(hrQGradesService.getHrQGradesById(id));
    }
}
