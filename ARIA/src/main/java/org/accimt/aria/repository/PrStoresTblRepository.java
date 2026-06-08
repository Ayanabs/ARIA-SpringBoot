package org.accimt.aria.repository;

import org.accimt.aria.entity.PrStoresTbl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrStoresTblRepository extends JpaRepository<PrStoresTbl, Integer> {
}
