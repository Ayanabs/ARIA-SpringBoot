package org.accimt.aria.repository;

import org.accimt.aria.entity.PrClosed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrClosedRepository extends JpaRepository<PrClosed, Integer> {
}
