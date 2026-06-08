package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.LvActingTblDto;
import org.accimt.aria.service.LvActingTblService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leave-acting")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class LvActingTblController {

    private final LvActingTblService lvActingTblService;

    @GetMapping
    public ResponseEntity<List<LvActingTblDto>> getAllLvActingTbls() {
        return ResponseEntity.ok(lvActingTblService.getAllLvActingTbls());
    }

    @GetMapping("/{id}")
    public ResponseEntity<LvActingTblDto> getLvActingTblById(@PathVariable Integer id) {
        return ResponseEntity.ok(lvActingTblService.getLvActingTblById(id));
    }
}
