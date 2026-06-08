package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrDesignationTblDto;
import org.accimt.aria.service.HrDesignationTblService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-designations")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrDesignationTblController {

    private final HrDesignationTblService hrDesignationTblService;

    @GetMapping
    public ResponseEntity<List<HrDesignationTblDto>> getAllHrDesignations() {
        return ResponseEntity.ok(hrDesignationTblService.getAllHrDesignations());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrDesignationTblDto> getHrDesignationById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrDesignationTblService.getHrDesignationById(id));
    }
}
