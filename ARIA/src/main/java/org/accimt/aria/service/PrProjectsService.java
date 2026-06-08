package org.accimt.aria.service;

import org.accimt.aria.dto.PrProjectsDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PrProjectsService {

    PrProjectsDto getPrProjectsById(Integer serialNo);
    List<PrProjectsDto> getAllPrProjects();

}
