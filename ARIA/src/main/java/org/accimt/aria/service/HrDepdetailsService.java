package org.accimt.aria.service;

import org.accimt.aria.dto.HrDepdetailsDto;
import java.util.List;

public interface HrDepdetailsService {
    HrDepdetailsDto getHrDepdetailsById(Integer id);
    List<HrDepdetailsDto> getAllHrDepdetails();
}
