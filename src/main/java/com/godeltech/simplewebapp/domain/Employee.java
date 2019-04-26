package com.godeltech.simplewebapp.domain;

import com.godeltech.simplewebapp.domain.enums.Gender;
import lombok.*;

import javax.persistence.*;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmployee;

    @Column(name = "first_name")
    @NonNull
    private String firstName;

    @Column(name = "last_name")
    @NonNull
    private String lastName;

    @Column(name = "department_id")
    @NonNull
    private Long idDepartment;

    @Column(name = "job_title")
    @NonNull
    private String jobTitle;

    @Column(name = "gender")
    @NonNull
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "date_of_birth")
    @NonNull
    @Temporal(TemporalType.DATE)
    private LocalDate date;
}
