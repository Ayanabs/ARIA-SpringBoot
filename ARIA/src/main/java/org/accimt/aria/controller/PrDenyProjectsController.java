package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrDenyProjectsDto;
import org.accimt.aria.service.PrDenyProjectsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pr-deny-projects")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class PrDenyProjectsController {

    private final PrDenyProjectsService prDenyProjectsService;

    @GetMapping
    public ResponseEntity<List<PrDenyProjectsDto>> getAllPrDenyProjects() {
        return ResponseEntity.ok(prDenyProjectsService.getAllPrDenyProjects());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrDenyProjectsDto> getPrDenyProjectsById(@PathVariable Integer id) {
        return ResponseEntity.ok(prDenyProjectsService.getPrDenyProjectsById(id));
    }
}
