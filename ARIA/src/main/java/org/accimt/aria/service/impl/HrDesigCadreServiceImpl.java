package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrDesigCadreDto;
import org.accimt.aria.entity.HrDesigCadre;
import org.accimt.aria.mapping.HrDesigCadreMapping;
import org.accimt.aria.repository.HrDesigCadreRepository;
import org.accimt.aria.service.HrDesigCadreService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrDesigCadreServiceImpl implements HrDesigCadreService {

    private final HrDesigCadreRepository hrDesigCadreRepository;
    private final HrDesigCadreMapping hrDesigCadreMapping;

    @Override
    public HrDesigCadreDto getHrDesigCadreById(Integer id) {
        HrDesigCadre entity = hrDesigCadreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HrDesigCadre not found with code: " + id));
        return hrDesigCadreMapping.toDto(entity);
    }

    @Override
    public List<HrDesigCadreDto> getAllHrDesigCadres() {
        return hrDesigCadreRepository.findAll().stream()
                .map(hrDesigCadreMapping::toDto)
                .collect(Collectors.toList());
    }
}
