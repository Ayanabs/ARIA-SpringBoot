package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrTempSalaryInfoDto;
import org.accimt.aria.service.HrTempSalaryInfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr-temp-salary-info")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class HrTempSalaryInfoController {

    private final HrTempSalaryInfoService hrTempSalaryInfoService;

    @GetMapping
    public ResponseEntity<List<HrTempSalaryInfoDto>> getAllHrTempSalaryInfos() {
        return ResponseEntity.ok(hrTempSalaryInfoService.getAllHrTempSalaryInfos());
    }

    @GetMapping("/{empNo}")
    public ResponseEntity<HrTempSalaryInfoDto> getHrTempSalaryInfoByEmpNo(@PathVariable Integer empNo) {
        return ResponseEntity.ok(hrTempSalaryInfoService.getHrTempSalaryInfoByEmpNo(empNo));
    }
}
