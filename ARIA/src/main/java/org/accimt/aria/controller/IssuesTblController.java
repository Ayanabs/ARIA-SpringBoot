package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.IssuesTblDto;
import org.accimt.aria.service.IssuesTblService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/issues")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class IssuesTblController {

    private final IssuesTblService issuesTblService;

    @GetMapping
    public ResponseEntity<List<IssuesTblDto>> getAllIssuesTbls() {
        return ResponseEntity.ok(issuesTblService.getAllIssuesTbls());
    }

    @GetMapping("/{attDtId}")
    public ResponseEntity<IssuesTblDto> getIssuesTblById(@PathVariable Integer attDtId) {
        return ResponseEntity.ok(issuesTblService.getIssuesTblById(attDtId));
    }
}
