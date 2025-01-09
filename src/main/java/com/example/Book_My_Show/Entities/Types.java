package com.example.Book_My_Show.Entities;



import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Types {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typeId;

    private String typeName;

    @ManyToMany(mappedBy = "types")
    private Set<Movies> movies = new HashSet<>();

    // Getters and Setters
}
