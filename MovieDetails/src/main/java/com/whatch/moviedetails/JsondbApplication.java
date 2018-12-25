package com.whatch.moviedetails;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.whatch.moviedetails.model.Movie;
import com.whatch.moviedetails.service.MovieService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class JsondbApplication {
    public static void main(String[] args){
        SpringApplication.run(JsondbApplication.class,args);
    }


    @Bean
    CommandLineRunner runner(MovieService movieService){
        return args -> {
            //read json and write to db
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<Movie>> typeReference = new TypeReference<List<Movie>>(){};
            InputStream inputStream =TypeReference.class.getResourceAsStream("/json/movies.json");
            try{
                List<Movie> movies = mapper.readValue(inputStream,typeReference);
                for(Movie movie :movies){
                    movieService.saveMovie(movie);
                }
                System.out.println("Movies saved!");
            }catch (IOException e){
                System.out.println("Unable to save movies: " + e.getMessage() );
            }
        };
    }

}
