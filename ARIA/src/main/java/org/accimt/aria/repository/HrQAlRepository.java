package org.accimt.aria.repository;

import org.accimt.aria.entity.HrQAl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrQAlRepository extends JpaRepository<HrQAl, Integer> {
}
