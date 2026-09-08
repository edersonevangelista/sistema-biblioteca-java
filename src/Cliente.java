public class Cliente extends Usuario {
    private String numeroCarteirinha;

    public Cliente (String nome, String email, String cpf,String numeroCarteirinha) {
        super(nome, email, cpf);
        this.numeroCarteirinha = numeroCarteirinha;
    }

    //Getter
    public String getNumeroCarteirinha() {
        return numeroCarteirinha;
    }
    //Setter
    public void setNumeroCarteirinha(String numeroCarteirinha) {
        this.numeroCarteirinha = numeroCarteirinha;
    }
}
