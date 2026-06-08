package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.EmpLvTblDto;
import org.accimt.aria.service.EmpLvTblService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-leaves")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class EmpLvTblController {

    private final EmpLvTblService empLvTblService;

    @GetMapping
    public ResponseEntity<List<EmpLvTblDto>> getAllEmpLvTbls() {
        return ResponseEntity.ok(empLvTblService.getAllEmpLvTbls());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpLvTblDto> getEmpLvTblById(@PathVariable Integer id) {
        return ResponseEntity.ok(empLvTblService.getEmpLvTblById(id));
    }
}
