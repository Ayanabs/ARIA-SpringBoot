package org.accimt.aria.repository;

import org.accimt.aria.entity.DayTypeTbl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayTypeTblRepository extends JpaRepository<DayTypeTbl, Integer> {
}
