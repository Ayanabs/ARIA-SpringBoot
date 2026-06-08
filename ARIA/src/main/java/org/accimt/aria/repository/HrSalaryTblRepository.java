package org.accimt.aria.repository;

import org.accimt.aria.entity.HrSalaryTbl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrSalaryTblRepository extends JpaRepository<HrSalaryTbl, Integer> {
}
