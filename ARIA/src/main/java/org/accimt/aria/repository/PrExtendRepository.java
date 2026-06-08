package org.accimt.aria.repository;

import org.accimt.aria.entity.PrExtend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrExtendRepository extends JpaRepository<PrExtend, Integer> {
}
