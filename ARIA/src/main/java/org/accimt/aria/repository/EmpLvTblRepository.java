package org.accimt.aria.repository;

import org.accimt.aria.entity.EmpLvTbl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpLvTblRepository extends JpaRepository<EmpLvTbl, Integer> {
}
