package entidades;

public class Cliente extends Pessoa{
    private String tipo;
    public Cliente(String nome, String email, String senha, String cpf, Endereco endereco, String tipo){
        super(nome, email, senha, cpf, endereco);
        this.tipo = tipo;
    }

    //getters
    public String getTipo() {
        return tipo;
    }

    //setters

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\nEmail: " + this.getEmail() + "\nCPF: " + this.getCpf() +
                "\nEndereço: " + this.getEndereco() + "\nTipo: " + this.tipo;
    }
}
