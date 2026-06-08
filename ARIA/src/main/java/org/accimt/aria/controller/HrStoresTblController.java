package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrStoresTblDto;
import org.accimt.aria.service.HrStoresTblService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-stores")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrStoresTblController {

    private final HrStoresTblService hrStoresTblService;

    @GetMapping
    public ResponseEntity<List<HrStoresTblDto>> getAllHrStoresTbls() {
        return ResponseEntity.ok(hrStoresTblService.getAllHrStoresTbls());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrStoresTblDto> getHrStoresTblById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrStoresTblService.getHrStoresTblById(id));
    }
}
