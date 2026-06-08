package org.accimt.aria.service;

import org.accimt.aria.dto.IssuesTblDto;
import java.util.List;

public interface IssuesTblService {
    IssuesTblDto getIssuesTblById(Integer attDtId);
    List<IssuesTblDto> getAllIssuesTbls();
}
