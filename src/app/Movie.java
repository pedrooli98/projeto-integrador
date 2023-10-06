package app;

public class Movie {

    public String synopsis;
    public int year;
    public String genre;
    public String title;

    //Constructor
    public Movie(String synopses, int year, String genre, String title) {
        this.synopsis = synopses;
        this.year = year;
        this.genre = genre;
        this.title = title;
    }

    public String getGenre(){
        return genre;
    }

    @Override
    public String toString() {
        return "Sinopse: " + this.synopsis + ";\n" +
                "Ano: " + this.year + ": \n" +
                "Genero: " + this.genre + ": \n" +
                "Titulo: " + this.title + ": \n";
    }
}
