package com.gk.clg.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "library")
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "library_id")
    private Set<Book> books;

}
