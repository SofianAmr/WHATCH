package com.whatch.moviedetails.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    private List<String> directors;
    private List<String> genre;
    private List<String> nationality;
    private int press_rating;
    private int user_rating;
    private List<String> actors;
    private String re_release_date;
    private int nber_press_vote;
    private int nber_user_vote;

    public Movie(){}


}
