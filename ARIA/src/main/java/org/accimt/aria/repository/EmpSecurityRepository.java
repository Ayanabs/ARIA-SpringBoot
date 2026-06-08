package org.accimt.aria.repository;

import org.accimt.aria.entity.EmpSecurity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpSecurityRepository extends JpaRepository<EmpSecurity, Integer> {
}
