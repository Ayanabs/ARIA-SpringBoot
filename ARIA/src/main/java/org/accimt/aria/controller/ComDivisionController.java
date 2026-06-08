package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.ComDivisionDto;
import org.accimt.aria.service.ComDivisionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/com-divisions")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class ComDivisionController {

    private final ComDivisionService comDivisionService;

    @GetMapping
    public ResponseEntity<List<ComDivisionDto>> getAllComDivisions() {
        return ResponseEntity.ok(comDivisionService.getAllComDivisions());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ComDivisionDto> getComDivisionById(@PathVariable Integer id) {
        return ResponseEntity.ok(comDivisionService.getComDivisionById(id));
    }
}
