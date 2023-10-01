package db;

import app.Movie;

import java.util.Stack;

//Clase que representa um banco de dados de filmes
public class Database {

    //Stack que armazena objetos da classe Movie
    public Stack<Movie> movieDatabase = new Stack<>();


    public  void newMovie(Movie movie) {
        this.movieDatabase.push(movie);
    }
}