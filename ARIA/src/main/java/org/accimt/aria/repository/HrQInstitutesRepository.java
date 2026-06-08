package org.accimt.aria.repository;

import org.accimt.aria.entity.HrQInstitutes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrQInstitutesRepository extends JpaRepository<HrQInstitutes, Integer> {
}
