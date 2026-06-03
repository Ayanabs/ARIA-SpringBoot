package org.accimt.aria.repository;

import org.accimt.aria.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmail(String email);
    Optional<Employee> findByEmpno(Integer empno);
    Optional<Employee> findByNicnum(String nicnum);
    List<Employee> findByMobilenoOrPhoneOfficeOrPhoneResidence(String mobileno, String phoneOffice, String phoneResidence);
}
