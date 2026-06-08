package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.LvDtsTblDto;
import org.accimt.aria.service.LvDtsTblService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leave-dates")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class LvDtsTblController {

    private final LvDtsTblService lvDtsTblService;

    @GetMapping
    public ResponseEntity<List<LvDtsTblDto>> getAllLvDtsTbls() {
        return ResponseEntity.ok(lvDtsTblService.getAllLvDtsTbls());
    }

    @GetMapping("/{id}")
    public ResponseEntity<LvDtsTblDto> getLvDtsTblById(@PathVariable Integer id) {
        return ResponseEntity.ok(lvDtsTblService.getLvDtsTblById(id));
    }
}
