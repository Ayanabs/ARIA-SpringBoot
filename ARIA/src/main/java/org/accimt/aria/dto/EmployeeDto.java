package org.accimt.aria.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private Long id;
    private Integer empno;
    private String title;

    @NotBlank(message = "Full name is required")
    private String fullname;

    private String nicnum;
    private LocalDate dob;
    private String gender;

    @NotBlank(message = "Email is required")
    @Email(message = "Please provide a valid email address")
    private String email;

    private String mobileno;
    private LocalDate dateofappoinment;
    private Integer divisioncode;
    private Integer desigcode;
    private Integer emptypecode;
    private Integer categorycode;
    private LocalDate retirementdt;
    private LocalDate probationperiod;
    private LocalDate probationperiodto;
    private LocalDate resignation;
    private String address;
    private String address2;
    private String address3;
    private String salarycode;
    private String maritalstatus;
    private String grade;
    private String tBillEntitle;
    private String phoneOffice;
    private String phoneResidence;
    private String empNamewithInit;
    private LocalDate incrementDate;
    private String status;

    private CategoryDto category;
    private DivisionDto division;
    private DesignationDto designation;
    private EmpTypeDto empType;
    private HrSalaryDto hrSalary;
}
