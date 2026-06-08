package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.EmpGradeDto;
import org.accimt.aria.service.EmpGradeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-grades")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class EmpGradeController {

    private final EmpGradeService empGradeService;

    @GetMapping
    public ResponseEntity<List<EmpGradeDto>> getAllEmpGrades() {
        return ResponseEntity.ok(empGradeService.getAllEmpGrades());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpGradeDto> getEmpGradeById(@PathVariable Integer id) {
        return ResponseEntity.ok(empGradeService.getEmpGradeById(id));
    }
}
