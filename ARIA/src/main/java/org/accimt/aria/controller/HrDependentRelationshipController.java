package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrDependentRelationshipDto;
import org.accimt.aria.service.HrDependentRelationshipService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-dependent-relationships")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrDependentRelationshipController {

    private final HrDependentRelationshipService hrDependentRelationshipService;

    @GetMapping
    public ResponseEntity<List<HrDependentRelationshipDto>> getAllHrDependentRelationships() {
        return ResponseEntity.ok(hrDependentRelationshipService.getAllHrDependentRelationships());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrDependentRelationshipDto> getHrDependentRelationshipById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrDependentRelationshipService.getHrDependentRelationshipById(id));
    }
}
