package com.example.Book_My_Show.Entities;



import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Formats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long formatId;

    private String formatName;

    @ManyToMany(mappedBy = "formats")
    private Set<Movies> movies = new HashSet<>();

    // Getters and Setters
}
