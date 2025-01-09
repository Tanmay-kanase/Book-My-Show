package com.example.Book_My_Show.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long castId;

    private String picUrl;
    private String name;
    private String role;
    private String language;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movies movie;

    // Getters and Setters
}
