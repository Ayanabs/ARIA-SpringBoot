package org.accimt.aria.service;

import org.accimt.aria.dto.HrQAlDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HrQAlService {
    HrQAlDto getHrQAlById(Integer id);
    List<HrQAlDto> getAllHrQAl();
}
