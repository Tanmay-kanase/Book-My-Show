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
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    private String userName;
    private String userProfile;
    private String description;
    private int likes;
    private int dislikes;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movies movie;

    // Getters and Setters
}
