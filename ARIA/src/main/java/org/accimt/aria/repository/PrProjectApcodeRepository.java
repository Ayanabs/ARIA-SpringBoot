package org.accimt.aria.repository;

import org.accimt.aria.entity.PrProjectApcode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrProjectApcodeRepository extends JpaRepository<PrProjectApcode, Integer> {
}
