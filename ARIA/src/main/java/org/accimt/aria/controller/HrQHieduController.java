package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQHieduDto;
import org.accimt.aria.service.HrQHieduService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-q-hi-edu")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrQHieduController {

    private final HrQHieduService hrQHieduService;

    @GetMapping
    public ResponseEntity<List<HrQHieduDto>> getAllHrQHiedus() {
        return ResponseEntity.ok(hrQHieduService.getAllHrQHiedus());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrQHieduDto> getHrQHieduById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrQHieduService.getHrQHieduById(id));
    }
}
