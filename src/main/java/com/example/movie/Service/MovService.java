package com.example.movie.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.movie.Dao.MovDao;
import com.example.movie.Entity.Movie;
@Service
public class MovService {
@Autowired
MovDao da;
	
	public Movie insertmovie(Movie mov) {
		return da.insertmovie(mov);

}

	public Movie findmovie(int e1) {
		return da.findmovie(e1);
	}

	public Movie update(Movie e1) {
		return da.update(e1);
	}

	public Movie delete(int m3) {
		return da.delete(m3);
	}

	public List<Movie> findAllmovie() {
		return da.findAllmovie();
	}
	

}