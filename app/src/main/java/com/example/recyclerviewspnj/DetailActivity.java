package com.example.recyclerviewspnj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;


public class DetailActivity extends AppCompatActivity {

    public static final String MOVIE_KEY = "movie_key";

    private Movie movie;
    private ImageView moviePoster;
    private TextView movieTitle, movieDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setView();
        bindingData();
    }

    private void setView(){
        moviePoster = findViewById(R.id.imageDetailMoviePoster);
        movieTitle = findViewById(R.id.textDetailMovieTitle);
        movieDescription = findViewById(R.id.textDetailMovieDescription);
    }

    private void bindingData(){
        movie = (Movie) getIntent().getSerializableExtra(MOVIE_KEY);

        movieTitle.setText(movie.movieTitle);
        movieDescription.setText(movie.movieDescription);

        Glide.with(this).load(movie.moviePosterUrl).into(moviePoster);
    }
}