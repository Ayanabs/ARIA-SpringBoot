package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.DenyProjectsDto;
import org.accimt.aria.service.DenyProjectsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/deny-projects")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class DenyProjectsController {

    private final DenyProjectsService denyProjectsService;

    @GetMapping
    public ResponseEntity<List<DenyProjectsDto>> getAllDenyProjects() {
        return ResponseEntity.ok(denyProjectsService.getAllDenyProjects());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DenyProjectsDto> getDenyProjectById(@PathVariable Integer id) {
        return ResponseEntity.ok(denyProjectsService.getDenyProjectById(id));
    }
}
