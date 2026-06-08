package org.accimt.aria.repository;

import org.accimt.aria.entity.HrDivisionTbl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrDivisionTblRepository extends JpaRepository<HrDivisionTbl, Integer> {
}
