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
public class Crew {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long crewId;

    private String picUrl;
    private String name;
    private String role;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movies movie;

    // Getters and Setters dmension , movieformats , movietype
}
