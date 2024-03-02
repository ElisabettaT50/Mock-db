package com.example.h2mockdb.entities;

import jakarta.persistence.*;

@Table(name = "students")
@Entity
public class StudentEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false,unique = true)
    private String email;
}