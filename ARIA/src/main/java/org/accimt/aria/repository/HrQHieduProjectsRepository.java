package org.accimt.aria.repository;

import org.accimt.aria.entity.HrQHieduProjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrQHieduProjectsRepository extends JpaRepository<HrQHieduProjects, Integer> {
}
