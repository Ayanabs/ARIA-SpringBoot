package org.accimt.aria.repository;

import org.accimt.aria.entity.DivBudgTbl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivBudgTblRepository extends JpaRepository<DivBudgTbl, Integer> {
}
