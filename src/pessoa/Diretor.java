package pessoa;

public class Diretor extends Funcionario{
    public Diretor(int idade, String nome, String cpf, double salario, String formacao) {
        super(idade, nome, cpf, salario, formacao);
    }

    public Diretor() {
    }

    //POLIMORFISMO
    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 1000;
    }
}
