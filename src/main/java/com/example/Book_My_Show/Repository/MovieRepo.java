package com.example.Book_My_Show.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Book_My_Show.Entities.Cast;
import com.example.Book_My_Show.Entities.Crew;
import com.example.Book_My_Show.Entities.Formats;
import com.example.Book_My_Show.Entities.Languages;
import com.example.Book_My_Show.Entities.Movies;
import com.example.Book_My_Show.Entities.Reviews;
import com.example.Book_My_Show.Entities.Types;

@Repository
public interface MovieRepo {
public interface MoviesRepository extends JpaRepository<Movies, Long> {}
public interface LanguagesRepository extends JpaRepository<Languages, Long> {}
public interface TypesRepository extends JpaRepository<Types, Long> {}
public interface FormatsRepository extends JpaRepository<Formats, Long> {}
public interface ReviewsRepository extends JpaRepository<Reviews, Long> {}
public interface CastRepository extends JpaRepository<Cast, Long> {}
public interface CrewRepository extends JpaRepository<Crew, Long> {}

}
