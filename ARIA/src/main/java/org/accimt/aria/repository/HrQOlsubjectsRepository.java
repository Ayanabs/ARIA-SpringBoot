package org.accimt.aria.repository;

import org.accimt.aria.entity.HrQOlsubjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrQOlsubjectsRepository extends JpaRepository<HrQOlsubjects, Integer> {
}
