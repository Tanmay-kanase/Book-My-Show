package com.example.Book_My_Show.Entities;



import java.util.HashSet;
import java.util.Set;
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
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;

    private String movieName;
    private String about;
    private double rating;
    private int time;
    private String releaseDate;
    private int ageLimit;
    private String backgroundImage;
    private String thumbnail;

    @ManyToMany
    @JoinTable(
        name = "MovieLanguages",
        joinColumns = @JoinColumn(name = "movie_id"),
        inverseJoinColumns = @JoinColumn(name = "language_id")
    )
    private Set<Languages> languages = new HashSet<>();

    @ManyToMany
    @JoinTable(
        name = "MovieTypes",
        joinColumns = @JoinColumn(name = "movie_id"),
        inverseJoinColumns = @JoinColumn(name = "type_id")
    )
    private Set<Types> types = new HashSet<>();

    @ManyToMany
    @JoinTable(
        name = "MovieFormats",
        joinColumns = @JoinColumn(name = "movie_id"),
        inverseJoinColumns = @JoinColumn(name = "format_id")
    )
    private Set<Formats> formats = new HashSet<>();

    // Getters and Setters
}
