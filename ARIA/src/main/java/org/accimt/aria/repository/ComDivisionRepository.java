package org.accimt.aria.repository;

import org.accimt.aria.entity.ComDivision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComDivisionRepository extends JpaRepository<ComDivision, Integer> {
}
