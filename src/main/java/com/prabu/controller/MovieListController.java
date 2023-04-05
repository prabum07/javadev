package com.prabu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/a")
public class MovieListController {
	
	//@Autowired
	private MovieListInterface mlI ;

	
	@RequestMapping(method=RequestMethod.GET ,value="/movies/{actor}")
	@ResponseBody
	public String getMovieListByActor(@PathVariable("actor") String name)
	{
		Runnable task = () -> {
		    System.out.println("Running in a separate thread");
		};
		Thread thread = new Thread(task);
		thread.start();
	//	List<Movies> movieList=mlI.moviesByActor(name);
	//	System.out.print(mlI);
		return "a";
	}
	@RequestMapping(method=RequestMethod.POST ,value="/movies", consumes="application/json")
	public ResponseEntity<Object> addMovie(@RequestBody Movies movie)
	{
		mlI.saveAndFlush(movie);
	return	ResponseEntity.ok().build();
	
		
	}
}
