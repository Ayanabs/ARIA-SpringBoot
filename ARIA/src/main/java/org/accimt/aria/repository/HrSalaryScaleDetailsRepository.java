package org.accimt.aria.repository;

import org.accimt.aria.entity.HrSalaryScaleDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrSalaryScaleDetailsRepository extends JpaRepository<HrSalaryScaleDetails, Integer> {
}
