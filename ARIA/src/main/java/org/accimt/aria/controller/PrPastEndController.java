package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrPastEndDto;
import org.accimt.aria.service.PrPastEndService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pr-past-ends")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class PrPastEndController {

    private final PrPastEndService prPastEndService;

    @GetMapping
    public ResponseEntity<List<PrPastEndDto>> getAllPrPastEnds() {
        return ResponseEntity.ok(prPastEndService.getAllPrPastEnds());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrPastEndDto> getPrPastEndById(@PathVariable Integer id) {
        return ResponseEntity.ok(prPastEndService.getPrPastEndById(id));
    }
}
