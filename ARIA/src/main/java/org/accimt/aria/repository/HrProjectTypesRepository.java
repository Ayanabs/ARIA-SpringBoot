package org.accimt.aria.repository;

import org.accimt.aria.entity.HrProjectTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrProjectTypesRepository extends JpaRepository<HrProjectTypes, Integer> {
}
