package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrProjectTypes2Dto;
import org.accimt.aria.service.PrProjectTypes2Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pr-project-types-2")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class PrProjectTypes2Controller {

    private final PrProjectTypes2Service prProjectTypes2Service;

    @GetMapping
    public ResponseEntity<List<PrProjectTypes2Dto>> getAllPrProjectTypes2() {
        return ResponseEntity.ok(prProjectTypes2Service.getAllPrProjectTypes2());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrProjectTypes2Dto> getPrProjectTypes2ById(@PathVariable Integer id) {
        return ResponseEntity.ok(prProjectTypes2Service.getPrProjectTypes2ById(id));
    }
}
