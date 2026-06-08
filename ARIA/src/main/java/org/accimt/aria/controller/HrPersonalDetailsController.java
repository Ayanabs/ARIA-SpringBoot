package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrPersonalDetailsDto;
import org.accimt.aria.service.HrPersonalDetailsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-personal-details")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrPersonalDetailsController {

    private final HrPersonalDetailsService hrPersonalDetailsService;

    @GetMapping
    public ResponseEntity<List<HrPersonalDetailsDto>> getAllHrPersonalDetails() {
        return ResponseEntity.ok(hrPersonalDetailsService.getAllHrPersonalDetails());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrPersonalDetailsDto> getHrPersonalDetailsByEmpNo(@PathVariable Integer id) {
        return ResponseEntity.ok(hrPersonalDetailsService.getHrPersonalDetailsByEmpNo(id));
    }
}
