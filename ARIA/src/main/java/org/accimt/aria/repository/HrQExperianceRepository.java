package org.accimt.aria.repository;

import org.accimt.aria.entity.HrQExperiance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrQExperianceRepository extends JpaRepository<HrQExperiance, Integer> {
}
