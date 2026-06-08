package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrProjectTypesDto;
import org.accimt.aria.service.HrProjectTypesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-project-types")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrProjectTypesController {

    private final HrProjectTypesService hrProjectTypesService;

    @GetMapping
    public ResponseEntity<List<HrProjectTypesDto>> getAllHrProjectTypes() {
        return ResponseEntity.ok(hrProjectTypesService.getAllHrProjectTypes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrProjectTypesDto> getHrProjectTypesById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrProjectTypesService.getHrProjectTypesById(id));
    }
}
