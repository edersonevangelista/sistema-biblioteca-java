public class LivroFisico extends Livro {

    private int numeroPaginas;

    public LivroFisico(String titulo, String autor, int anoDePublicacao, boolean disponivel, int numeroPaginas) {
        super(titulo, autor, anoDePublicacao, disponivel);
        this.numeroPaginas = numeroPaginas;
    }

    //Getter
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    //Setter
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
