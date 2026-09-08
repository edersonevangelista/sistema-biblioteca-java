public class Main {

    public static void main (String[] args){
        Livro livro = new Livro("Guerra e Paz", "Liev Tolstoi", 1865, true);

        System.out.println(livro.isDisponivel());
        livro.emprestar();
        System.out.println(livro.isDisponivel());
        livro.devolver();
        System.out.println(livro.isDisponivel());

    }
}
