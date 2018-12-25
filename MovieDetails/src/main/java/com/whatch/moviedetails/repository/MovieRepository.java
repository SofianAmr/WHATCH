package com.whatch.moviedetails.repository;

import com.whatch.moviedetails.model.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {


}
