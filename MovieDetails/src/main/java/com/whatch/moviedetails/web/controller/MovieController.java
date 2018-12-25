package com.whatch.moviedetails.web.controller;
import com.whatch.moviedetails.model.Movie;
import com.whatch.moviedetails.service.MovieService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Movies")
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService){

        this.movieService=movieService;

    }

    @GetMapping("/List")
    public Iterable<Movie> getAllMovies(){
        return movieService.list();
    }

}