package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrDenyClosedprjDto;
import org.accimt.aria.service.PrDenyClosedprjService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pr-deny-closed-projects")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class PrDenyClosedprjController {

    private final PrDenyClosedprjService prDenyClosedprjService;

    @GetMapping
    public ResponseEntity<List<PrDenyClosedprjDto>> getAllPrDenyClosedprjs() {
        return ResponseEntity.ok(prDenyClosedprjService.getAllPrDenyClosedprjs());
    }

    @GetMapping("/{pCode}")
    public ResponseEntity<PrDenyClosedprjDto> getPrDenyClosedprjByPCode(@PathVariable String pCode) {
        return ResponseEntity.ok(prDenyClosedprjService.getPrDenyClosedprjByPCode(pCode));
    }
}
