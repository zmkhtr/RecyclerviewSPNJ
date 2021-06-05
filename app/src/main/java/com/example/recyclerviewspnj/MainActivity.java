package com.example.recyclerviewspnj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.List;

import static com.example.recyclerviewspnj.DetailActivity.MOVIE_KEY;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerviewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setView();
        adapter = new RecyclerviewAdapter(this);
        initRecyclerView();
    }

    private void setView(){
        recyclerView = findViewById(R.id.recyclerMainListMovie);
    }

    private void initRecyclerView(){
        List<Movie> movieList = Movie.fetchData();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        adapter.setMovieList(movieList);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);


        adapter.setOnItemClickListener(new RecyclerviewAdapter.OnItemClick() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(MOVIE_KEY, movieList.get(position));
                startActivity(intent);
            }
        });
    }
}