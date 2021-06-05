package com.example.recyclerviewspnj;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Movie implements Serializable {

    String moviePosterUrl;
    String movieTitle;
    String movieDescription;

    public Movie(String moviePosterUrl, String movieTitle, String movieDescription) {
        this.moviePosterUrl = moviePosterUrl;
        this.movieTitle = movieTitle;
        this.movieDescription = movieDescription;
    }

    public String getMoviePosterUrl() {
        return moviePosterUrl;
    }

    public void setMoviePosterUrl(String moviePosterUrl) {
        this.moviePosterUrl = moviePosterUrl;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public static List<Movie> fetchData(){

        List<Movie> movieList = new ArrayList<>();

        movieList.add(new Movie("https://images-na.ssl-images-amazon.com/images/I/41Qih7wfraL._SX331_BO1,204,203,200_.jpg", "Sherk", "Shrek, animated cartoon character, a towering, green ogre whose fearsome appearance belies a kind heart. Shrek is the star of a highly successful series of animated films."));
        movieList.add(new Movie("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTgK1DKx7KpKz-P5hGjDpT7IYUjm3JkhmdJXIxp2oiJV2h3lZxSEFIWZuOERS0IzM3aAGU&usqp=CAU", "Marsha ", "Shrek, animated cartoon character, a towering, green ogre whose fearsome appearance belies a kind heart. Shrek is the star of a highly successful series of animated films."));
        movieList.add(new Movie("https://upload.wikimedia.org/wikipedia/en/9/9a/NarutoUzumaki.png", "Naruto", "Shrek, animated cartoon character, a towering, green ogre whose fearsome appearance belies a kind heart. Shrek is the star of a highly successful series of animated films."));
        movieList.add(new Movie("https://upload.wikimedia.org/wikipedia/en/a/af/Son_Goku_YoungAdult.PNG", "Goku", "Shrek, animated cartoon character, a towering, green ogre whose fearsome appearance belies a kind heart. Shrek is the star of a highly successful series of animated films.  Shrek is the star of a highly successful series of animated films.  Shrek is the star of a highly successful series of animated films. Shrek is the star of a highly successful series of animated films. Shrek is the star of a highly successful series of animated films.  Shrek is the star of a highly successful series of animated films. Shrek is the star of a highly successful series of animated films. Shrek is the star of a highly successful series of animated films. Shrek is the star of a highly successful series of animated films. Shrek is the star of a highly successful series of animated films. Shrek is the star of a highly successful series of animated films. Shrek is the star of a highly successful series of animated films. Shrek is the star of a highly successful series of animated films."));
        movieList.add(new Movie("https://cdn0-production-images-kly.akamaized.net/Yq9lzYdKvJskOFPPgQFweIXqkwg=/640x640/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/946748/original/029523200_1438762512-iron_man_games.jpg", "Iron man", "Shrek, animated cartoon character, a towering, green ogre whose fearsome appearance belies a kind heart. Shrek is the star of a highly successful series of animated films."));


        return movieList;
    }



}


