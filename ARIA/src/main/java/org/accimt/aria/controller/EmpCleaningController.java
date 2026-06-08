package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.EmpCleaningDto;
import org.accimt.aria.service.EmpCleaningService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-cleanings")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class EmpCleaningController {

    private final EmpCleaningService empCleaningService;

    @GetMapping
    public ResponseEntity<List<EmpCleaningDto>> getAllEmpCleanings() {
        return ResponseEntity.ok(empCleaningService.getAllEmpCleanings());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpCleaningDto> getEmpCleaningById(@PathVariable Integer id) {
        return ResponseEntity.ok(empCleaningService.getEmpCleaningById(id));
    }
}
