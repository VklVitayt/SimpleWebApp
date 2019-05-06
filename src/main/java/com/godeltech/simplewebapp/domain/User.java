package com.godeltech.simplewebapp.domain;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @Column(name = "first_name")
    @NonNull
    private String firstName;

    @Column(name = "last_name")
    @NonNull
    private String lastName;

    @Column(name = "phone_number")
    @NonNull
    private Integer phoneNumber;

    @Column(name = "login")
    @NonNull
    private String login;

    @Column(name = "password")
    @NonNull
    private String password;
}
