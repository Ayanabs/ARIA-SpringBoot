package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQOlsubjectsDto;
import org.accimt.aria.service.HrQOlsubjectsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-q-ol-subjects")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrQOlsubjectsController {

    private final HrQOlsubjectsService hrQOlsubjectsService;

    @GetMapping
    public ResponseEntity<List<HrQOlsubjectsDto>> getAllHrQOlsubjects() {
        return ResponseEntity.ok(hrQOlsubjectsService.getAllHrQOlsubjects());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrQOlsubjectsDto> getHrQOlsubjectsById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrQOlsubjectsService.getHrQOlsubjectsById(id));
    }
}
