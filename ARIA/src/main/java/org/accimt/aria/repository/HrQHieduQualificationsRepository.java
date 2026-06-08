package org.accimt.aria.repository;

import org.accimt.aria.entity.HrQHieduQualifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrQHieduQualificationsRepository extends JpaRepository<HrQHieduQualifications, Integer> {
}
