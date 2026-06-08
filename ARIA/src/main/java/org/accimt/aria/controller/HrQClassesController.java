package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQClassesDto;
import org.accimt.aria.service.HrQClassesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-q-classes")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrQClassesController {

    private final HrQClassesService hrQClassesService;

    @GetMapping
    public ResponseEntity<List<HrQClassesDto>> getAllHrQClasses() {
        return ResponseEntity.ok(hrQClassesService.getAllHrQClasses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrQClassesDto> getHrQClassesById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrQClassesService.getHrQClassesById(id));
    }
}
