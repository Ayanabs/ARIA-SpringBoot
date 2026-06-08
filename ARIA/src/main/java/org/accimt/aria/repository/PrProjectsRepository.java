package org.accimt.aria.repository;

import org.accimt.aria.entity.PrProjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrProjectsRepository extends JpaRepository<PrProjects, Integer> {
}
