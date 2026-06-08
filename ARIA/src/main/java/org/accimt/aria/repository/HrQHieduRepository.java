package org.accimt.aria.repository;

import org.accimt.aria.entity.HrQHiedu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrQHieduRepository extends JpaRepository<HrQHiedu, Integer> {
}
