package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.DesignationDto;
import org.accimt.aria.service.DesignationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/designations")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class DesignationController {

    private final DesignationService designationService;

    @GetMapping
    public ResponseEntity<List<DesignationDto>> getAllDesignations() {
        return ResponseEntity.ok(designationService.getAllDesignations());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DesignationDto> getDesignationById(@PathVariable Integer id) {
        return ResponseEntity.ok(designationService.getDesignationById(id));
    }
}
