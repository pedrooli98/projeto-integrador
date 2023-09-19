package db;

import app.Movie;

import java.util.Stack;

public class Database {
    public Stack<Movie> movieDatabase = new Stack<>();


    public  void newMovie(Movie movie) {
        this.movieDatabase.push(movie);
    }

}
