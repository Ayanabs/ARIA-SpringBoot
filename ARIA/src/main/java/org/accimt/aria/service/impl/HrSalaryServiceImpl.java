package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrSalaryDto;
import org.accimt.aria.entity.HrSalary;
import org.accimt.aria.mapping.HrSalaryMapping;
import org.accimt.aria.repository.HrSalaryRepository;
import org.accimt.aria.service.HrSalaryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrSalaryServiceImpl implements HrSalaryService {

    private final HrSalaryRepository hrSalaryRepository;
    private final HrSalaryMapping hrSalaryMapping;

    @Override
    public HrSalaryDto createHrSalary(HrSalaryDto dto) {
        HrSalary entity = hrSalaryMapping.mapToEntity(dto);
        HrSalary savedEntity = hrSalaryRepository.save(entity);
        return hrSalaryMapping.toDto(savedEntity);
    }

    @Override
    public HrSalaryDto updateHrSalary(HrSalaryDto dto) {
        HrSalary existing = hrSalaryRepository.findById(dto.getSalarycode())
                .orElseThrow(() -> new RuntimeException("Salary scale not found with code: " + dto.getSalarycode()));

        if (dto.getSalaryscale() != null) existing.setSalaryscale(dto.getSalaryscale());

        HrSalary updated = hrSalaryRepository.save(existing);
        return hrSalaryMapping.toDto(updated);
    }

    @Override
    public HrSalaryDto getHrSalaryById(String id) {
        HrSalary entity = hrSalaryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Salary scale not found with code: " + id));
        return hrSalaryMapping.toDto(entity);
    }

    @Override
    public List<HrSalaryDto> getAllHrSalaries() {
        return hrSalaryRepository.findAll().stream()
                .map(hrSalaryMapping::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteHrSalaryById(String id) {
        hrSalaryRepository.deleteById(id);
    }
}
