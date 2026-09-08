public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private boolean disponivel;

    public Livro (String titulo, String autor, int anoDePublicacao, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.disponivel = disponivel;
    }
    //Getters
    public String getTitulo() {

        return titulo;
    }
    public String getAutor() {

        return autor;
    }
    public int getAnoDePublicacao() {

        return anoDePublicacao;
    }
    public boolean isDisponivel() {

        return disponivel;
    }
    //Setters
    public void setTitulo(String titulo){

        this.titulo = titulo;
    }
    public void setAutor(String autor) {

        this.autor = autor;
    }
    public void setAnoDePublicacao(int anoDePublicacao) {

        this.anoDePublicacao = anoDePublicacao;
    }
    public void setDisponivel( boolean disponivel) {

        this.disponivel = disponivel;
    }

    //metodo emprestar/devolver
    public void emprestar() {
        disponivel = false;
    }
    public void devolver() {
        disponivel = true;
    }

}
