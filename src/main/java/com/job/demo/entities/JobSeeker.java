package com.job.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "jobSeekers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class JobSeeker {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "age")
    private int age;
    @Column(name = "education_level")
    private String educationLevel;
    @Column(name = "province")
    private String province;
    @Column(name = "district")
    private String district;
    @Column(name = "soldiery")
    private String soldiery;
}
