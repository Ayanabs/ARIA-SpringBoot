package org.accimt.aria.repository;

import org.accimt.aria.entity.HrSalaryScale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrSalaryScaleRepository extends JpaRepository<HrSalaryScale, Integer> {
}
