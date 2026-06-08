package org.accimt.aria.service;

import org.accimt.aria.dto.PrDenyProjectsDto;
import java.util.List;

public interface PrDenyProjectsService {
    PrDenyProjectsDto getPrDenyProjectsById(Integer id);
    List<PrDenyProjectsDto> getAllPrDenyProjects();
}
