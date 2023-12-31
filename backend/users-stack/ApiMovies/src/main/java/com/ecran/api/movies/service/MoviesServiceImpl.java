/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecran.api.movies.service;

import com.ecran.api.movies.data.MovieEntity;
import java.util.ArrayList;
import java.util.List;

import com.ecran.api.movies.io.controllers.UserValorationDTO;
import org.springframework.stereotype.Service;

@Service
public class MoviesServiceImpl implements MoviesService {
    // Array Movies
//    @Override
//    public List<String> findWatchlist(String userId) {
//        List<String> movieIds = new ArrayList<>();
//        movieIds.add("movie1Id");
//        movieIds.add("movie2Id");
//        return movieIds;
//    }
    @Override
    public List<MovieEntity> findWatchlist(List<String> ids) {
        List<MovieEntity> returnValue = new ArrayList<>();

        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setMovieId("64e4d1b9daf2a2c7f2f2d1f7");
        movieEntity.setTitle("Patton Oswald: Annihilation");
        movieEntity.setActors("Patton Oswalt");
        movieEntity.setDirector("Bobcat Goldthwait");
        movieEntity.setComposer("John Williams");
        movieEntity.setReview("Review");
        movieEntity.setImage_url("https://ecran.s3.amazonaws.com/Peliculas/annihilation.jpg");
        movieEntity.setTrailer_url("https://www.youtube.com/watch?v=4hZi5QaMBFc&ab_channel=Netflix");
        movieEntity.setRt_score("100");
        movieEntity.setImdb_score("7.3");
        movieEntity.setGenre("Comedia");
        movieEntity.setMc_score("72");
        returnValue.add(movieEntity);

        MovieEntity movieEntity2 = new MovieEntity();
        movieEntity2.setMovieId("64e4d1b9daf2a2c7f2f2d1f7");
        movieEntity2.setTitle("Patton Oswald: Annihilation");
        movieEntity2.setActors("Patton Oswalt");
        movieEntity2.setDirector("Bobcat Goldthwait");
        movieEntity2.setComposer("John Williams");
        movieEntity2.setReview("Review");
        movieEntity2.setImage_url("https://ecran.s3.amazonaws.com/Peliculas/annihilation.jpg");
        movieEntity2.setTrailer_url("https://www.youtube.com/watch?v=4hZi5QaMBFc&ab_channel=Netflix");
        movieEntity2.setRt_score("100");
        movieEntity2.setImdb_score("7.3");
        movieEntity2.setGenre("Comedia");
        movieEntity2.setMc_score("72");
        returnValue.add(movieEntity2);

        return returnValue;
    }

    @Override
    public String addValoration(String id, UserValorationDTO uvDTO) {
        System.out.println("Rating modificado: " + "Movie id ->" + id + "Ultima Valoracion, Suma y Cantidad:" + uvDTO.toString());
        return "Rating modificado: " + "Movie id ->" + id + "Ultima Valoracion, Suma y Cantidad:" + uvDTO.toString();
    }

}
