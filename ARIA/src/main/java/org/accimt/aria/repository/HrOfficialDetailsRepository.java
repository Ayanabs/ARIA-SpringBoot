package org.accimt.aria.repository;

import org.accimt.aria.entity.HrOfficialDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrOfficialDetailsRepository extends JpaRepository<HrOfficialDetails, Integer> {
}
