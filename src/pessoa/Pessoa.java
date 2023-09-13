package pessoa;

//CLASE "MÃE 2"
import animal.Animal;
public abstract class Pessoa extends Animal {
    private String cpf;

    public Pessoa(int idade, String nome, String cpf) {
        super(idade, nome);
        this.cpf = cpf;
    }

    public Pessoa() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
