package org.accimt.aria.repository;

import org.accimt.aria.entity.EmpSlvTbl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpSlvTblRepository extends JpaRepository<EmpSlvTbl, Integer> {
}
