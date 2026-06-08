package org.accimt.aria.repository;

import org.accimt.aria.entity.HrEduLevels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrEduLevelsRepository extends JpaRepository<HrEduLevels, Integer> {
}
