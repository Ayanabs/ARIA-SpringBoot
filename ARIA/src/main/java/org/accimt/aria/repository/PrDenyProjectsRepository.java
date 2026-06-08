package org.accimt.aria.repository;

import org.accimt.aria.entity.PrDenyProjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrDenyProjectsRepository extends JpaRepository<PrDenyProjects, Integer> {
}
