public class Main {

    public static void main (String[] args){
        Livro livro = new Livro("Guerra e Paz", "Liev Tolstoi", 1865, true);

        livro.emprestar();
        livro.emprestar();

        livro.devolver();
        livro.devolver();

        livro.exibirInformacoes();

        System.out.println("--------------------------------");

        LivroFisico livroFisico = new LivroFisico("Guerra e Paz", "Liev Tolstoi", 1865, true, 350);

        livroFisico.exibirInformacoes();

        System.out.println("--------------------------------");

        Ebook ebook = new Ebook("Crime e Castigo", "Fiódor Dostoiévski", 1866, true, 15.0);

        ebook.exibirInformacoes();


    }
}
