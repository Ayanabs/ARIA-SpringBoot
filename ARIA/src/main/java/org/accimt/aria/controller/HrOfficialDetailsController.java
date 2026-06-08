package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrOfficialDetailsDto;
import org.accimt.aria.service.HrOfficialDetailsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-official-details")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrOfficialDetailsController {

    private final HrOfficialDetailsService hrOfficialDetailsService;

    @GetMapping
    public ResponseEntity<List<HrOfficialDetailsDto>> getAllHrOfficialDetails() {
        return ResponseEntity.ok(hrOfficialDetailsService.getAllHrOfficialDetails());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrOfficialDetailsDto> getHrOfficialDetailsByEmpNo(@PathVariable Integer id) {
        return ResponseEntity.ok(hrOfficialDetailsService.getHrOfficialDetailsByEmpNo(id));
    }
}
