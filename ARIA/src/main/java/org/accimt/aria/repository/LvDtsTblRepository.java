package org.accimt.aria.repository;

import org.accimt.aria.entity.LvDtsTbl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LvDtsTblRepository extends JpaRepository<LvDtsTbl, Integer> {
}
