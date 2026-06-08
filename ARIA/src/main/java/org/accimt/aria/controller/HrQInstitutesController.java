package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQInstitutesDto;
import org.accimt.aria.service.HrQInstitutesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-q-institutes")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrQInstitutesController {

    private final HrQInstitutesService hrQInstitutesService;

    @GetMapping
    public ResponseEntity<List<HrQInstitutesDto>> getAllHrQInstitutes() {
        return ResponseEntity.ok(hrQInstitutesService.getAllHrQInstitutes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrQInstitutesDto> getHrQInstitutesById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrQInstitutesService.getHrQInstitutesById(id));
    }
}
