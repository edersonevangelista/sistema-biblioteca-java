public class Emprestimo {
    private Cliente cliente;
    private Livro livro;

    public Emprestimo (Cliente cliente, Livro livro) {
        this.cliente = cliente;
        this.livro = livro;
    }

    //Getters
    public Cliente getCliente() {
        return cliente;
    }
    public Livro getLivro() {
        return livro;
    }
}
