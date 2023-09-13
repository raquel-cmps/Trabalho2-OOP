package pessoa;

public class Secretario extends Funcionario{
    public Secretario(int idade, String nome, String cpf, double salario, String formacao) {
        super(idade, nome, cpf, salario, formacao);
    }

    public Secretario() {
    }
    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 500;
    }
}
