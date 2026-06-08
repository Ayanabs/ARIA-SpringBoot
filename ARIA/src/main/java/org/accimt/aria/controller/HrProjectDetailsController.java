package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrProjectDetailsDto;
import org.accimt.aria.service.HrProjectDetailsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-project-details")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrProjectDetailsController {

    private final HrProjectDetailsService hrProjectDetailsService;

    @GetMapping
    public ResponseEntity<List<HrProjectDetailsDto>> getAllHrProjectDetails() {
        return ResponseEntity.ok(hrProjectDetailsService.getAllHrProjectDetails());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrProjectDetailsDto> getHrProjectDetailsBySerialNo(@PathVariable Integer id) {
        return ResponseEntity.ok(hrProjectDetailsService.getHrProjectDetailsBySerialNo(id));
    }
}
