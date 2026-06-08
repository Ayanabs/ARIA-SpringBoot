package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrTempSalaryInfoDto;
import org.accimt.aria.entity.HrTempSalaryInfo;
import org.accimt.aria.mapping.HrTempSalaryInfoMapping;
import org.accimt.aria.repository.HrTempSalaryInfoRepository;
import org.accimt.aria.service.HrTempSalaryInfoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrTempSalaryInfoServiceImpl implements HrTempSalaryInfoService {

    private final HrTempSalaryInfoRepository hrTempSalaryInfoRepository;
    private final HrTempSalaryInfoMapping hrTempSalaryInfoMapping;

    @Override
    public HrTempSalaryInfoDto getHrTempSalaryInfoByEmpNo(Integer empNo) {
        HrTempSalaryInfo hrTempSalaryInfo = hrTempSalaryInfoRepository.findById(empNo)
                .orElseThrow(() -> new RuntimeException("HrTempSalaryInfo not found with empNo: " + empNo));
        return hrTempSalaryInfoMapping.toDto(hrTempSalaryInfo);
    }

    @Override
    public List<HrTempSalaryInfoDto> getAllHrTempSalaryInfos() {
        return hrTempSalaryInfoRepository.findAll().stream()
                .map(hrTempSalaryInfoMapping::toDto)
                .collect(Collectors.toList());
    }
}
