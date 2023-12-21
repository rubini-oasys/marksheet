package com.example.movie.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie.Entity.Movie;
import com.example.movie.Service.MovService;

@RestController
@RequestMapping(value = "/movie")
@CrossOrigin(origins="*")
public class MovController {

	@Autowired
	MovService ser;

	@PostMapping(value = "/add")
	public Movie insertmovie(@RequestBody Movie mov) {
		return ser.insertmovie(mov);

	}

	@GetMapping(value = "/find/{e1}")
	public Movie findmovie(@PathVariable int e1) {
		return ser.findmovie(e1);
	}
	@PutMapping(value = "/update")
	public Movie update(@RequestBody Movie e1) {
		return ser.update(e1);


}
	@DeleteMapping(value = "/remove/{m3}")
	public Movie delete(@PathVariable int m3) {
		return ser.delete(m3);

}
	@GetMapping(value = "/findall")
	public List<Movie> findAllmovie() {
		return ser.findAllmovie();
	}
	}
