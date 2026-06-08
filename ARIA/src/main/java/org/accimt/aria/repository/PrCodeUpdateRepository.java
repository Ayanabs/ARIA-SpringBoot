package org.accimt.aria.repository;

import org.accimt.aria.entity.PrCodeUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrCodeUpdateRepository extends JpaRepository<PrCodeUpdate, Integer> {
}
