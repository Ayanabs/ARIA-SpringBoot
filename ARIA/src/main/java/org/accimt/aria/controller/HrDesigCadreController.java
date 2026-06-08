package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrDesigCadreDto;
import org.accimt.aria.service.HrDesigCadreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-desig-cadres")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrDesigCadreController {

    private final HrDesigCadreService hrDesigCadreService;

    @GetMapping
    public ResponseEntity<List<HrDesigCadreDto>> getAllHrDesigCadres() {
        return ResponseEntity.ok(hrDesigCadreService.getAllHrDesigCadres());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrDesigCadreDto> getHrDesigCadreById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrDesigCadreService.getHrDesigCadreById(id));
    }
}
