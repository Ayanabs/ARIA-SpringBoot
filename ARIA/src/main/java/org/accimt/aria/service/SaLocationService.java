package org.accimt.aria.service;

import org.accimt.aria.dto.SaLocationDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SaLocationService {

    SaLocationDto getSaLocationById(Integer id);
    List<SaLocationDto> getAllSaLocations();

}
