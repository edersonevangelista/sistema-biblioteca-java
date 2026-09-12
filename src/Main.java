public class Main {
    public static void main (String[] args) {
        Livro livroFisico = new LivroFisico(
                "Guerra e Paz",
                "Liev Tolstoi",
                1865,
                true,
                350
        );

        Livro ebook = new Ebook(
                "Crime e Castigo",
                "Fiódor Dostoiévski",
                1866,
                true,
                15.0
        );

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livroFisico);
        biblioteca.adicionarLivro(ebook);

        biblioteca.listarLivros();
    }
}