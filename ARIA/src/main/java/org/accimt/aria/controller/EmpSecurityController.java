package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.EmpSecurityDto;
import org.accimt.aria.service.EmpSecurityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-securities")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class EmpSecurityController {

    private final EmpSecurityService empSecurityService;

    @GetMapping
    public ResponseEntity<List<EmpSecurityDto>> getAllEmpSecurities() {
        return ResponseEntity.ok(empSecurityService.getAllEmpSecurities());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpSecurityDto> getEmpSecurityById(@PathVariable Integer id) {
        return ResponseEntity.ok(empSecurityService.getEmpSecurityById(id));
    }
}
