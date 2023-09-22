import app.Movie;
import db.Database;

public class Main {

    public static void main(String[] args) {
        Database database = new Database();
//      aqui inicializamos nossa classe database;
//      sua funcao, como diz o nome instancia um banco de dados em uma stack,
//      de modo que nossos dados sejam armazenados para futuras consultas

        Movie newMovie =  new Movie("filme sobre qualquer coisa", 2005, "acao");
        database.newMovie(newMovie);
//      instanciamos uma nova classe de Movie, seu constructor, pede as informacoes que nos interessam;
//      temos que salvar nosso novo filme no banco de dados

        System.out.println(database.movieDatabase.get(0));
//      aqui podemos pegar o filme que foi instanciado e acessar os parametros da classe.
    }
}
//      a fazer:
//          1 - criar uma funcao que filtre o input do usuario que seria um genero
//                  e retorne uma Stack dos filmes filtrados;
//          2 - criar uma funcao que pegue uma Stack<>(lista) de filmes e retorne um filme
//                  aletorio desta lista.