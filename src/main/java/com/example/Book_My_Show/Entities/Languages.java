package com.example.Book_My_Show.Entities;



import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Languages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long languageId;

    private String languageName;

    @ManyToMany(mappedBy = "languages")
    private Set<Movies> movies = new HashSet<>();

    // Getters and Setters
}
