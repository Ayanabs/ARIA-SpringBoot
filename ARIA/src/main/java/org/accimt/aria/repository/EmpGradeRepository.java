package org.accimt.aria.repository;

import org.accimt.aria.entity.EmpGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpGradeRepository extends JpaRepository<EmpGrade, Integer> {
}
