package org.accimt.aria.repository;

import org.accimt.aria.entity.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DivisionRepository extends JpaRepository<Division, Integer> {
    Optional<Division> findByDivision(String division);
}
