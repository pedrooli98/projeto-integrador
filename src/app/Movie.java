package app;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

// Classe que contém as informaçoes sobre os filmes
public class Movie {

    //Detalhes do filme
    public String sinopse;
    public int ano;
    public String genero;
    public String titulo;

    //Constructor
    public Movie(String sinopse, int ano, String genero, String titulo) {
        this.sinopse = sinopse;
        this.ano = ano;
        this.genero = genero;
        this.titulo = titulo;
    }

    //Retorna o gênero do filme
    public String getGenero(){
        return genero;
    }

    //Filtra os filmes pelo gênero
    public static Stack<Movie> filtrarMoviePorGenero(String genero, List<Movie> movies) {
        Stack<Movie> filmesFiltrados = new Stack<>();

        for (Movie filme : movies) {
            if (filme.getGenero().equalsIgnoreCase(genero)) {
                filmesFiltrados.push(filme);
            }
        }
        return filmesFiltrados;
    }

    //Informaçoes sobre os filmes
    public static void main (String[]args){
        List<Movie> listaMovie = new ArrayList<>();
        listaMovie.add(new Movie("Um grupo de amigos que descobre como invocar espíritos usando uma mão embalsamada.", 2022, "Terror", "Fale Comigo"));
        listaMovie.add(new Movie ("Uma obra instigante sobre a eugenia e o racismo.", 2017, "Suspense", "Corra"));
        listaMovie.add(new Movie ("Uma boneca que representa um ideal de ser perfeito entra em uma crise em que passa a questionar a própria existência.", 20223, "Comédia", "Barbie"));
    }
}
