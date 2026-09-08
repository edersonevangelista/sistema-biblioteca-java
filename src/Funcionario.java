public class Funcionario extends Usuario {
    private String cargo;

    public Funcionario (String nome, String email, String cpf, String cargo) {
        super (nome, email, cpf);
        this.cargo = cargo;
    }
    //Getter
    public String getCargo() {
        return cargo;
    }
    //Setter
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
