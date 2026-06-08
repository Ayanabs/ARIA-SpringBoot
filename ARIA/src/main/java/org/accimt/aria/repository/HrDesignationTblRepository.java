package org.accimt.aria.repository;

import org.accimt.aria.entity.HrDesignationTbl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrDesignationTblRepository extends JpaRepository<HrDesignationTbl, Integer> {
}
