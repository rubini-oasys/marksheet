package com.example.movie.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.movie.Entity.Movie;
import com.example.movie.Repository.MovRepository;
@Repository
public class MovDao {
	@Autowired
	MovRepository rep;

	public Movie insertmovie(Movie mov) {
		return  rep.save(mov);
	

		
	}

	public Movie findmovie(int e1) {
		 return rep.findById(e1).get();

		
	}

	public Movie update(Movie e1) {
		return  rep.save(e1);
	}

	public Movie delete(int m3) {
		Movie mov=rep.findById(m3).get();
		rep.deleteById(m3);
		 return mov;
		}

	public List<Movie> findAllmovie() {
		return rep.findAll();
	}
	}


