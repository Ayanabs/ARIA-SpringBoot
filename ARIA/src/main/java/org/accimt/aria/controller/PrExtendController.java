package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrExtendDto;
import org.accimt.aria.service.PrExtendService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pr-extends")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class PrExtendController {

    private final PrExtendService prExtendService;

    @GetMapping
    public ResponseEntity<List<PrExtendDto>> getAllPrExtends() {
        return ResponseEntity.ok(prExtendService.getAllPrExtends());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrExtendDto> getPrExtendById(@PathVariable Integer id) {
        return ResponseEntity.ok(prExtendService.getPrExtendById(id));
    }
}
