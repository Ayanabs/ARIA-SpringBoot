package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.MainSubDivisionDto;
import org.accimt.aria.service.MainSubDivisionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/main-sub-divisions")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class MainSubDivisionController {

    private final MainSubDivisionService mainSubDivisionService;

    @GetMapping
    public ResponseEntity<List<MainSubDivisionDto>> getAllMainSubDivisions() {
        return ResponseEntity.ok(mainSubDivisionService.getAllMainSubDivisions());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MainSubDivisionDto> getMainSubDivisionById(@PathVariable Integer id) {
        return ResponseEntity.ok(mainSubDivisionService.getMainSubDivisionById(id));
    }
}
