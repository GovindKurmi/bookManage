package com.gk.clg.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "college")
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany
    @JoinColumn(name = "college_id")
    private Set<Department> departments;

    @OneToMany
    @JoinColumn(name = "college_id")
    private Set<Student> students;

    @OneToMany
    @JoinColumn(name = "college_id")
    private Set<Library> libraries;
}
