package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.ClaimTypeTblDto;
import org.accimt.aria.service.ClaimTypeTblService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/claim-types")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class ClaimTypeTblController {

    private final ClaimTypeTblService claimTypeTblService;

    @GetMapping
    public ResponseEntity<List<ClaimTypeTblDto>> getAllClaimTypes() {
        return ResponseEntity.ok(claimTypeTblService.getAllClaimTypes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClaimTypeTblDto> getClaimTypeById(@PathVariable Integer id) {
        return ResponseEntity.ok(claimTypeTblService.getClaimTypeById(id));
    }
}
