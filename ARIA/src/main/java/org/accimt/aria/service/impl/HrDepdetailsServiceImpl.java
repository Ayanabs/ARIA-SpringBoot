package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrDepdetailsDto;
import org.accimt.aria.entity.HrDepdetails;
import org.accimt.aria.mapping.HrDepdetailsMapping;
import org.accimt.aria.repository.HrDepdetailsRepository;
import org.accimt.aria.service.HrDepdetailsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrDepdetailsServiceImpl implements HrDepdetailsService {

    private final HrDepdetailsRepository hrDepdetailsRepository;
    private final HrDepdetailsMapping hrDepdetailsMapping;

    @Override
    public HrDepdetailsDto getHrDepdetailsById(Integer id) {
        HrDepdetails entity = hrDepdetailsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HrDepdetails not found with id: " + id));
        return hrDepdetailsMapping.toDto(entity);
    }

    @Override
    public List<HrDepdetailsDto> getAllHrDepdetails() {
        return hrDepdetailsRepository.findAll().stream()
                .map(hrDepdetailsMapping::toDto)
                .collect(Collectors.toList());
    }
}
