package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrProjectsDto;
import org.accimt.aria.service.PrProjectsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pr-projects")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class PrProjectsController {

    private final PrProjectsService prProjectsService;

    @GetMapping
    public ResponseEntity<List<PrProjectsDto>> getAllPrProjects() {
        return ResponseEntity.ok(prProjectsService.getAllPrProjects());
    }

    @GetMapping("/{serialNo}")
    public ResponseEntity<PrProjectsDto> getPrProjectsById(@PathVariable Integer serialNo) {
        return ResponseEntity.ok(prProjectsService.getPrProjectsById(serialNo));
    }
}
