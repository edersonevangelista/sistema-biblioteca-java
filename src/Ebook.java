public class Ebook extends Livro{

    private double tamanhoArquivo;

    public Ebook (String titulo, String autor, int anoDePublicacao, boolean disponivel, double tamanhoArquivo) {
        super(titulo,autor, anoDePublicacao, disponivel);
        this.tamanhoArquivo = tamanhoArquivo;
    }
    //Getter
    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }
    //Setter
    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }
}
