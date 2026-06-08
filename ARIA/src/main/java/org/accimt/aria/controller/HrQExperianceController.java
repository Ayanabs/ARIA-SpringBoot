package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQExperianceDto;
import org.accimt.aria.service.HrQExperianceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-q-experience")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrQExperianceController {

    private final HrQExperianceService hrQExperianceService;

    @GetMapping
    public ResponseEntity<List<HrQExperianceDto>> getAllHrQExperiance() {
        return ResponseEntity.ok(hrQExperianceService.getAllHrQExperiance());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrQExperianceDto> getHrQExperianceById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrQExperianceService.getHrQExperianceById(id));
    }
}
