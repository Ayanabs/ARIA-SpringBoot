package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.EmpTypeDto;
import org.accimt.aria.service.EmpTypeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee-types")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class EmpTypeController {

    private final EmpTypeService empTypeService;

    @GetMapping
    public ResponseEntity<List<EmpTypeDto>> getAllEmpTypes() {
        return ResponseEntity.ok(empTypeService.getAllEmpTypes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpTypeDto> getEmpTypeById(@PathVariable Integer id) {
        return ResponseEntity.ok(empTypeService.getEmpTypeById(id));
    }
}
