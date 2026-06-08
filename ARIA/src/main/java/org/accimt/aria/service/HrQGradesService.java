package org.accimt.aria.service;

import org.accimt.aria.dto.HrQGradesDto;
import java.util.List;

public interface HrQGradesService {
    HrQGradesDto getHrQGradesById(String id);
    List<HrQGradesDto> getAllHrQGrades();
}
