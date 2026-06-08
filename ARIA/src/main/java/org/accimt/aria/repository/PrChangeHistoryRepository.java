package org.accimt.aria.repository;

import org.accimt.aria.entity.PrChangeHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrChangeHistoryRepository extends JpaRepository<PrChangeHistory, Integer> {
}
