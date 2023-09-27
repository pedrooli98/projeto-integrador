package app;

import java.util.Date;

public class Movie {

    public String roteiro;
    public int ano;
    public String genero;
    public String nome;
    public Movie(String roteiro, int ano, String genero){
        this.roteiro = roteiro;
        this.ano = ano;
        this.genero = genero;
        this.nome = nome;
    }
    public String getGenero(){
        returne genero;
    }

    public static Stack <Movie>
        filtrarMoviePorGenero(String genero List<Movie>movie){
            Stack<Movie>filmesFiltrados=new Stack<>();

            for (Movie movie:movies){
                if (movie.getGenero().equalsIgnoreCase(genero))
                {
                    movieFiltrados.push(filme);
                }
            }

            return movieFiltrados;

        }
    
    public static void main (String[]args){
        List<Movie> listaMovie = new ArrayList<>();
        listaMovie.add(new Movie ("Filme 1 "terror"));
        listaMovie.add(new Movie ("Filme 2 "suspense"));
        listaMovie.add(new Movie ("Filme 3 "acao"));
        listaMovie.add(new Movie ("Filme 4 "comedia"));
}
