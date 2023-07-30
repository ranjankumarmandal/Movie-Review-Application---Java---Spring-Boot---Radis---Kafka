package com.example.moviereview.repository;

import com.example.moviereview.domain.Genre;
import com.example.moviereview.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {

    public Movie findByTitle(String title);

    public List<Movie> findByGenre(Genre genre);

}
