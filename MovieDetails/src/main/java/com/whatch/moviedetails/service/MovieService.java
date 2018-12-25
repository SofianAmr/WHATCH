package com.whatch.moviedetails.service;

import com.whatch.moviedetails.model.Movie;
import com.whatch.moviedetails.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public Iterable<Movie> list(){
        return movieRepository.findAll();
    }

    public Movie saveMovie(Movie movie){
        return movieRepository.save(movie);
    }

    /*public Iterable<Movie> saveListMovies(List<Movie> movies){
        return movieRepository.save(movies);
    }*/


}
