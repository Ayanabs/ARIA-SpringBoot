package org.accimt.aria.repository;

import org.accimt.aria.entity.EmpType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpTypeRepository extends JpaRepository<EmpType, Integer> {
    Optional<EmpType> findByEmptype(String emptype);
}
