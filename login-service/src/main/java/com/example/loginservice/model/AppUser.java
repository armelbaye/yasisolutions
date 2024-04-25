package com.example.loginservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity(name = "app_user")
@Data
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "username")
    private String userName;

    private String email;

    @Column(name = "first_name")
    private String password;

    @Column(name = "birthDate")
    private LocalDate dateOfBirth;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zipcode")
    private int zipcode;

}
