package org.accimt.aria.service;

import org.accimt.aria.dto.HrDependentRelationshipDto;
import java.util.List;

public interface HrDependentRelationshipService {
    HrDependentRelationshipDto getHrDependentRelationshipById(Integer id);
    List<HrDependentRelationshipDto> getAllHrDependentRelationships();
}
