package com.example.movie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movie.Entity.Movie;

public interface MovRepository extends JpaRepository<Movie, Integer>{

}
