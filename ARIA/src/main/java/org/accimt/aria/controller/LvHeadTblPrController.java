package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.LvHeadTblPrDto;
import org.accimt.aria.service.LvHeadTblPrService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leave-heads-pr")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class LvHeadTblPrController {

    private final LvHeadTblPrService lvHeadTblPrService;

    @GetMapping
    public ResponseEntity<List<LvHeadTblPrDto>> getAllLvHeadTblPrs() {
        return ResponseEntity.ok(lvHeadTblPrService.getAllLvHeadTblPrs());
    }

    @GetMapping("/{id}")
    public ResponseEntity<LvHeadTblPrDto> getLvHeadTblPrById(@PathVariable Integer id) {
        return ResponseEntity.ok(lvHeadTblPrService.getLvHeadTblPrById(id));
    }
}
