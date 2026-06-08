package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.EmpSlvTblDto;
import org.accimt.aria.service.EmpSlvTblService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-short-leaves")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class EmpSlvTblController {

    private final EmpSlvTblService empSlvTblService;

    @GetMapping
    public ResponseEntity<List<EmpSlvTblDto>> getAllEmpSlvTbls() {
        return ResponseEntity.ok(empSlvTblService.getAllEmpSlvTbls());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpSlvTblDto> getEmpSlvTblById(@PathVariable Integer id) {
        return ResponseEntity.ok(empSlvTblService.getEmpSlvTblById(id));
    }
}
