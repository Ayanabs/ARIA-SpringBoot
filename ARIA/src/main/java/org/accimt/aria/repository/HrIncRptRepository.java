package org.accimt.aria.repository;

import org.accimt.aria.entity.HrIncRpt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrIncRptRepository extends JpaRepository<HrIncRpt, Integer> {
}
