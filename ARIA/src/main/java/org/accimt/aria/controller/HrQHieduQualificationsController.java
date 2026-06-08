package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQHieduQualificationsDto;
import org.accimt.aria.service.HrQHieduQualificationsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-q-hi-edu-qualifications")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrQHieduQualificationsController {

    private final HrQHieduQualificationsService hrQHieduQualificationsService;

    @GetMapping
    public ResponseEntity<List<HrQHieduQualificationsDto>> getAllHrQHieduQualifications() {
        return ResponseEntity.ok(hrQHieduQualificationsService.getAllHrQHieduQualifications());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrQHieduQualificationsDto> getHrQHieduQualificationsById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrQHieduQualificationsService.getHrQHieduQualificationsById(id));
    }
}
