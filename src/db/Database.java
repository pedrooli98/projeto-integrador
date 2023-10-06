package db;

import app.Movie;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class Database {
    public ArrayList<Movie> movieDatabase = new ArrayList<>();

    public void newMovie(Movie movie) {
        this.movieDatabase.add(movie);
    }


    public Movie returnRandomMovieByGenre( String input) {
        ArrayList<Movie> filteredMovies = new ArrayList<>();
        ArrayList<Movie> movieLst = this.movieDatabase;

        for(Movie movie : movieLst) {
            if (movie.getGenre().equalsIgnoreCase(input)) {
                filteredMovies.add(movie);
            }
        }

        int index = new Random().nextInt(filteredMovies.size());
        return filteredMovies.get(index);
    }
}
