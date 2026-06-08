package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQHieduProjectsDto;
import org.accimt.aria.service.HrQHieduProjectsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-q-hi-edu-projects")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrQHieduProjectsController {

    private final HrQHieduProjectsService hrQHieduProjectsService;

    @GetMapping
    public ResponseEntity<List<HrQHieduProjectsDto>> getAllHrQHieduProjects() {
        return ResponseEntity.ok(hrQHieduProjectsService.getAllHrQHieduProjects());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrQHieduProjectsDto> getHrQHieduProjectsById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrQHieduProjectsService.getHrQHieduProjectsById(id));
    }
}
