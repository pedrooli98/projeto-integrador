import app.Movie;
import db.Database;

public class Main {

    public static void main(String[] args) {
        Database bancoDeDados = new Database();

        Movie novoFilme =  new Movie("filme sobre qualquer coisa", 2005, "acao");
        bancoDeDados.newMovie(novoFilme);

        System.out.println(bancoDeDados.movieDatabase.get(0));
    }
}