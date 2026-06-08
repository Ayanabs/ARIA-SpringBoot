package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQAlDto;
import org.accimt.aria.service.HrQAlService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-q-al")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrQAlController {

    private final HrQAlService hrQAlService;

    @GetMapping
    public ResponseEntity<List<HrQAlDto>> getAllHrQAl() {
        return ResponseEntity.ok(hrQAlService.getAllHrQAl());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrQAlDto> getHrQAlById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrQAlService.getHrQAlById(id));
    }
}
