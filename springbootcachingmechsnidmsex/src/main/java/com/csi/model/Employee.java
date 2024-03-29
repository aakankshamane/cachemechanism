package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int empId;

    @Size(min = 2, message = "Employee Name should be atleast 2 character")
    private String empName;

    private String empAddress;

    private double empSalary;

    private long empContactNumber;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date empDOB;

    @Email(message = "Email ID must be valid")
    private String empEmailId;

    @Size(min = 4, message = "Employee Password should be atleast 4 character")
    private String empPassword;


}
