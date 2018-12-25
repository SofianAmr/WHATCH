package com.whatch.moviedetails.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String movie_title;
    private String release_date;
    private String duration;
    private String directors;
    private String genre;
    private String nationality;
    private int press_rating;
    private int user_rating;

    public Movie(){}


}
