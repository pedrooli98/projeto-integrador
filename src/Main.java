import app.Movie;
import db.Database;

//Classe principal que inicia o programa
public class Main {

    //Método principal do programa que cria um banco de dados de filmes
    public static void main(String[] args) {
        //Instância do banco de dados do filme
        Database bancoDeDados = new Database();

        //Se...senao que verifica se o banco de dados de filmes nao está vazio
        if (!bancoDeDados.movieDatabase.isEmpty()) {
            int posicao = 0;
            if (posicao >= 0 && posicao < bancoDeDados.movieDatabase.size()) {
                Movie filmeSolicitado = bancoDeDados.movieDatabase.get(posicao);
                System.out.println(filmeSolicitado);
            } else {
                System.out.println("Filme não encontrado");
            }

            //Imprime informaçoes sobre o filme
            System.out.println(bancoDeDados.movieDatabase.get(0));
        }
    }
}