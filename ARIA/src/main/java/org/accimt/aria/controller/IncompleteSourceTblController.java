package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.IncompleteSourceTblDto;
import org.accimt.aria.service.IncompleteSourceTblService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/incomplete-sources")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class IncompleteSourceTblController {

    private final IncompleteSourceTblService incompleteSourceTblService;

    @GetMapping
    public ResponseEntity<List<IncompleteSourceTblDto>> getAllIncompleteSourceTbls() {
        return ResponseEntity.ok(incompleteSourceTblService.getAllIncompleteSourceTbls());
    }

    @GetMapping("/{id}")
    public ResponseEntity<IncompleteSourceTblDto> getIncompleteSourceTblById(@PathVariable Integer id) {
        return ResponseEntity.ok(incompleteSourceTblService.getIncompleteSourceTblById(id));
    }
}
