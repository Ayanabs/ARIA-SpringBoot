package org.accimt.aria.repository;

import org.accimt.aria.entity.PrProjectTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrProjectTypesRepository extends JpaRepository<PrProjectTypes, Integer> {
}
