package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrHighereduDetailsDto;
import org.accimt.aria.service.HrHighereduDetailsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-higher-edu-details")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrHighereduDetailsController {

    private final HrHighereduDetailsService hrHighereduDetailsService;

    @GetMapping
    public ResponseEntity<List<HrHighereduDetailsDto>> getAllHrHighereduDetails() {
        return ResponseEntity.ok(hrHighereduDetailsService.getAllHrHighereduDetails());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrHighereduDetailsDto> getHrHighereduDetailsById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrHighereduDetailsService.getHrHighereduDetailsById(id));
    }
}
