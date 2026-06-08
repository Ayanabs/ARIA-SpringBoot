package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrDepdetailsDto;
import org.accimt.aria.service.HrDepdetailsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-dep-details")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrDepdetailsController {

    private final HrDepdetailsService hrDepdetailsService;

    @GetMapping
    public ResponseEntity<List<HrDepdetailsDto>> getAllHrDepdetails() {
        return ResponseEntity.ok(hrDepdetailsService.getAllHrDepdetails());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HrDepdetailsDto> getHrDepdetailsById(@PathVariable Integer id) {
        return ResponseEntity.ok(hrDepdetailsService.getHrDepdetailsById(id));
    }
}
