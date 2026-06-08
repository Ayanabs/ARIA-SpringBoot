package org.accimt.aria.repository;

import org.accimt.aria.entity.HrDependentRelationship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrDependentRelationshipRepository extends JpaRepository<HrDependentRelationship, Integer> {
}
