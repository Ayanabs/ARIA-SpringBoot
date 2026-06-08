package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.LvHeadTblDto;
import org.accimt.aria.service.LvHeadTblService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leave-heads")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class LvHeadTblController {

    private final LvHeadTblService lvHeadTblService;

    @GetMapping
    public ResponseEntity<List<LvHeadTblDto>> getAllLvHeadTbls() {
        return ResponseEntity.ok(lvHeadTblService.getAllLvHeadTbls());
    }

    @GetMapping("/{id}")
    public ResponseEntity<LvHeadTblDto> getLvHeadTblById(@PathVariable Integer id) {
        return ResponseEntity.ok(lvHeadTblService.getLvHeadTblById(id));
    }
}
