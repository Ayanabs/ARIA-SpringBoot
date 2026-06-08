package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrEduLevelsDto;
import org.accimt.aria.service.HrEduLevelsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-edu-levels")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrEduLevelsController {

    private final HrEduLevelsService hrEduLevelsService;

    @GetMapping
    public ResponseEntity<List<HrEduLevelsDto>> getAllHrEduLevels() {
        return ResponseEntity.ok(hrEduLevelsService.getAllHrEduLevels());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrEduLevelsDto> getHrEduLevelById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrEduLevelsService.getHrEduLevelById(id));
    }
}
