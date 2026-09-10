import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args){
        Livro livro = new Livro("Guerra e Paz", "Liev Tolstoi", 1865, true);

        livro.emprestar();
        livro.emprestar();

        livro.devolver();
        livro.devolver();

        livro.exibirInformacoes();

        System.out.println("--------------------------------");

        Livro livroFisico = new LivroFisico(
                "Guerra e Paz",
                "Liev Tolstoi",
                1865,
                true,
                350);

        livroFisico.exibirInformacoes();

        System.out.println("--------------------------------");

        Livro ebook = new Ebook("Crime e Castigo", "Fiódor Dostoiévski", 1866, true, 15.0);

        ebook.exibirInformacoes();

        System.out.println("--------------------------------");

        Livro livroTeste;

        livroTeste = new LivroFisico(
                "O Hobbit",
                "J.R.R. Tolkien",
                1937,
                true,
                310
        );

        livroTeste.exibirInformacoes();

        System.out.println("--------------------------------");

        livroTeste = new Ebook(
                "1984",
                "George Orwell",
                1949,
                true,
                8.5
        );

        livroTeste.exibirInformacoes();

        List<Livro> livros = new ArrayList<>();

        livros.add(livroFisico);
        livros.add(ebook);

        for (Livro livroAtual : livros) {
            livroAtual.exibirInformacoes();
        }




    }
}
