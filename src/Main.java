import app.Movie;
import db.Database;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Database database = new Database();
//      aqui inicializamos nossa classe database;

//      sua funcao, como diz o nome instancia um banco de dados em uma stack,
//      de modo que nossos dados sejam armazenados para futuras consultas
        database.newMovie(new Movie("Um grupo de amigos que descobre como invocar espíritos usando uma mão embalsamada.", 2022, "Terror", "Fale Comigo"));
        database.newMovie(new Movie ("Uma obra instigante sobre a eugenia e o racismo.", 2017, "Suspense", "Corra"));
        database.newMovie(new Movie("Uma boneca que representa um ideal de ser perfeito entra em uma crise em que passa a questionar a própria existência.", 20223, "Comedia", "Barbie"));

        database.newMovie(new Movie("Na remota Antártida, um grupo de cientistas americanos é perturbado em sua base quando, de um helicóptero, alguém atira em um cão do acampamento.\n" +
                "À medida que socorrem o cão baleado, o bicho começa a atacar os cientistas e os outros cachorros e logo eles descobrem que o animal pode assumir a forma de suas vítimas.\n" +
                "Isto significa que membros da equipe podem ser mortos e a cópia assumir o lugar deles. Com isso, um piloto e um médico precisam capturar a fera antes que seja tarde demais.",
                1983, "Terror", "O Enigma de Outro Mundo"));
        database.newMovie(new Movie("Em Parasita, toda a família de Ki-taek está desempregada, vivendo num porão sujo e apertado. Uma obra do acaso faz com que o filho adolescente\n" +
                "da família comece a dar aulas de inglês à garota de uma família rica. Fascinados com a vida luxuosa destas pessoas, pai, mãe, filho e filha bolam um plano para se infiltrarem\n" +
                "também na família burguesa, um a um. No entanto, os segredos e mentiras necessários à ascensão social custarão caro a todos.",
                2019, "Suspense", "Parasita"));
        database.newMovie(new Movie("Truman Burbank é um cidadão aparentemente comum que vive em uma ilha chamada Seahaven. Casado e com um emprego estável, todos\n" +
                "os dias ele faz o mesmo trajeto, encontra as mesmas pessoas no caminho e, ao que parece, leva uma vida feliz.",
                1998, "Comedia", "O Show de Truman"));

         database.newMovie(new Movie("Durante o período em que fica no cativeiro, ele encontra um antigo telefone, através do qual começa a receber mensagens das vítimas do criminoso que já partiram deste mundo.",
                2022, "Terror", "O Telefone Preto"));
        database.newMovie(new Movie("Após dois anos desde o surgimento do Batman (Christian Bale), os criminosos de Gotham City têm muito o que temer. Com a ajuda do tenente James Gordon (Gary Oldman) e do promotor 
                público Harvey Dent (Aaron Eckhart), Batman luta contra o crime organizado. Acuados com o combate, os chefes do crime aceitam a proposta feita pelo Coringa (Heath Ledger) e o 
                contratam para combater o Homem-Morcego.",
                2008, "Suspense", "Batman - O Cavaleiro das Trevas"));
        database.newMovie(new Movie("Depois de abrir uma agência de investigação, Nick e Audrey Spitz finalmente conseguem um caso importante: um amigo bilionário é sequestrado no dia de seu casamento.",
                2023, "Comedia", "Mistério em Paris"));

//      instanciamos uma nova classe de Movie, seu constructor, pede as informacoes que nos interessam;
//      temos que salvar nosso novo filme no banco de dados;

        chatBot(database);
//      aqui podemos pegar o filme que foi instanciado e acessar os parametros da classe.
    }

    private static String chatBot (Database db) {
        int initializer = 0;
        while (initializer == 0) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bem vinde ao Chat Bot de Filmes!!!\uD83C\uDFA5 \uD83D\uDCFD \uD83C\uDF9E");

            System.out.println("Digite o genero de filme: \"Terror\", \"Suspense\" ou \"Comedia\"");
            String chosenGenre = scanner.nextLine();

            if (chosenGenre.isBlank()) {
                System.out.println("Erro: nada foi digitado");
                System.out.println("Deseja continuar S/n");
                String exitOrContinue = scanner.nextLine();
                if (!exitOrContinue.isBlank() || exitOrContinue.equalsIgnoreCase("n")) {
                    initializer = 1;
                    System.out.println("Obirigado por jogar");
                }
            }

            Movie movieByGenre = db.returnRandomMovieByGenre(chosenGenre);
            System.out.println(movieByGenre);

            System.out.println("Deseja continuar? S/n");
            String exitOrContinue = scanner.nextLine();
            if (!exitOrContinue.isBlank() || exitOrContinue.equalsIgnoreCase("n")) {
                initializer = 1;
                System.out.println("Obirigado por jogar");
            }
        }
        return null;
    }
}
