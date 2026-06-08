package org.accimt.aria.repository;

import org.accimt.aria.entity.HrQAlsubjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrQAlsubjectsRepository extends JpaRepository<HrQAlsubjects, Integer> {
}
