package pessoa;

public class Professor extends Funcionario{

    public Professor(int idade, String nome, String cpf, double salario, String formacao) {
        super(idade, nome, cpf, salario, formacao);
    }

    public Professor() {
    }

    //POLIMORFISMO
    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 900;
    }

}
