package org.accimt.aria.repository;

import org.accimt.aria.entity.HrDesigCadre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrDesigCadreRepository extends JpaRepository<HrDesigCadre, Integer> {
}
