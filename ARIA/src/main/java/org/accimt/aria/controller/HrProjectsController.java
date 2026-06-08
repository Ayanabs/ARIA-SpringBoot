package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrProjectsDto;
import org.accimt.aria.service.HrProjectsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-projects")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrProjectsController {

    private final HrProjectsService hrProjectsService;

    @GetMapping
    public ResponseEntity<List<HrProjectsDto>> getAllHrProjects() {
        return ResponseEntity.ok(hrProjectsService.getAllHrProjects());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrProjectsDto> getHrProjectsById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrProjectsService.getHrProjectsById(id));
    }
}
