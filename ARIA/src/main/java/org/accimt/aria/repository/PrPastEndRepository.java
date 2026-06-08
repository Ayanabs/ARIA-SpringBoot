package org.accimt.aria.repository;

import org.accimt.aria.entity.PrPastEnd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrPastEndRepository extends JpaRepository<PrPastEnd, Integer> {
}
