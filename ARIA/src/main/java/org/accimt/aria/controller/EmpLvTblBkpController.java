package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.EmpLvTblBkpDto;
import org.accimt.aria.service.EmpLvTblBkpService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-leaves-bkp")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class EmpLvTblBkpController {

    private final EmpLvTblBkpService empLvTblBkpService;

    @GetMapping
    public ResponseEntity<List<EmpLvTblBkpDto>> getAllEmpLvTblBkps() {
        return ResponseEntity.ok(empLvTblBkpService.getAllEmpLvTblBkps());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpLvTblBkpDto> getEmpLvTblBkpById(@PathVariable Integer id) {
        return ResponseEntity.ok(empLvTblBkpService.getEmpLvTblBkpById(id));
    }
}
