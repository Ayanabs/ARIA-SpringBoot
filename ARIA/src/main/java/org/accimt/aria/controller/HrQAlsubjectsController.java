package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQAlsubjectsDto;
import org.accimt.aria.service.HrQAlsubjectsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-q-al-subjects")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrQAlsubjectsController {

    private final HrQAlsubjectsService hrQAlsubjectsService;

    @GetMapping
    public ResponseEntity<List<HrQAlsubjectsDto>> getAllHrQAlsubjects() {
        return ResponseEntity.ok(hrQAlsubjectsService.getAllHrQAlsubjects());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrQAlsubjectsDto> getHrQAlsubjectsById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrQAlsubjectsService.getHrQAlsubjectsById(id));
    }
}
