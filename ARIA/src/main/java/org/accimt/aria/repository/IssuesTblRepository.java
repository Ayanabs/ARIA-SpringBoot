package org.accimt.aria.repository;

import org.accimt.aria.entity.IssuesTbl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssuesTblRepository extends JpaRepository<IssuesTbl, Integer> {
}
