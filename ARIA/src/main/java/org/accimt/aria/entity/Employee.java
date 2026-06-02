package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;


@Entity
@Setter
@Getter
@Table(name = "emp_details_tbl")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "empno")
    private Integer empno;

    @Column(name = "title", length = 10)
    private String title;

    @Column(name = "fullname", length = 200)
    private String fullname;

    @Column(name = "nicnum", length = 12)
    private String nicnum;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "gender", length = 6)
    private String gender;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "mobileno", length = 100)
    private String mobileno;

    @Column(name = "dateofappoinment")
    private LocalDate dateofappoinment;

    @Column(name = "divisioncode")
    private Integer divisioncode;

    @Column(name = "desigcode")
    private Integer desigcode;

    @Column(name = "emptypecode")
    private Integer emptypecode;

    @Column(name = "categorycode")
    private Integer categorycode;

    @Column(name = "retirementdt")
    private LocalDate retirementdt;

    @Column(name = "probationperiod")
    private LocalDate probationperiod;

    @Column(name = "probationperiodto")
    private LocalDate probationperiodto;

    @Column(name = "resignation")
    private LocalDate resignation;

    @Column(name = "address", length = 100)
    private String address;

    @Column(name = "address2", length = 100)
    private String address2;

    @Column(name = "address3", length = 100)
    private String address3;

    @Column(name = "salarycode", length = 50)
    private String salarycode;

    @Column(name = "maritalstatus", length = 100)
    private String maritalstatus;

    @Column(name = "grade", length = 11)
    private String grade;

    @Column(name = "t_bill_entitle", length = 2)
    private String tBillEntitle;

    @Column(name = "phone_office", length = 100)
    private String phoneOffice;

    @Column(name = "phone_residence", length = 100)
    private String phoneResidence;

    @Column(name = "emp_namewith_init", length = 200)
    private String empNamewithInit;

    @Column(name = "increment_date")
    private LocalDate incrementDate;

    @Column(name = "status", length = 2)
    private String status;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categorycode", referencedColumnName = "categorycode", insertable = false, updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private Category category;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "divisioncode", referencedColumnName = "divisioncode", insertable = false, updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private Division division;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "desigcode", referencedColumnName = "desigcode", insertable = false, updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private Designation designation;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emptypecode", referencedColumnName = "emptypecode", insertable = false, updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private EmpType empType;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "salarycode", referencedColumnName = "salarycode", insertable = false, updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private HrSalary hrSalary;
}
