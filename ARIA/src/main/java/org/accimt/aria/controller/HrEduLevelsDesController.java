package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrEduLevelsDesDto;
import org.accimt.aria.service.HrEduLevelsDesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-edu-levels-des")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrEduLevelsDesController {

    private final HrEduLevelsDesService hrEduLevelsDesService;

    @GetMapping
    public ResponseEntity<List<HrEduLevelsDesDto>> getAllHrEduLevelsDes() {
        return ResponseEntity.ok(hrEduLevelsDesService.getAllHrEduLevelsDes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrEduLevelsDesDto> getHrEduLevelsDesById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrEduLevelsDesService.getHrEduLevelsDesById(id));
    }
}
