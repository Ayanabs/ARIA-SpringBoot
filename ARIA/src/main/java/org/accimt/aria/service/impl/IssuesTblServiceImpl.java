package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.IssuesTblDto;
import org.accimt.aria.entity.IssuesTbl;
import org.accimt.aria.mapping.IssuesTblMapping;
import org.accimt.aria.repository.IssuesTblRepository;
import org.accimt.aria.service.IssuesTblService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class IssuesTblServiceImpl implements IssuesTblService {

    private final IssuesTblRepository issuesTblRepository;
    private final IssuesTblMapping issuesTblMapping;

    @Override
    public IssuesTblDto getIssuesTblById(Integer attDtId) {
        IssuesTbl issuesTbl = issuesTblRepository.findById(attDtId)
                .orElseThrow(() -> new RuntimeException("IssuesTbl not found with id: " + attDtId));
        return issuesTblMapping.toDto(issuesTbl);
    }

    @Override
    public List<IssuesTblDto> getAllIssuesTbls() {
        return issuesTblRepository.findAll().stream()
                .map(issuesTblMapping::toDto)
                .collect(Collectors.toList());
    }
}
