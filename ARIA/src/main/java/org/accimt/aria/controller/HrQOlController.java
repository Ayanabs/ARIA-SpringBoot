package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQOlDto;
import org.accimt.aria.service.HrQOlService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-q-ol")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrQOlController {

    private final HrQOlService hrQOlService;

    @GetMapping
    public ResponseEntity<List<HrQOlDto>> getAllHrQOls() {
        return ResponseEntity.ok(hrQOlService.getAllHrQOls());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrQOlDto> getHrQOlById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrQOlService.getHrQOlById(id));
    }
}
