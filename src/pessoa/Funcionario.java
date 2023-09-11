package pessoa;
//CLASSE "MÃE 3"
public class Funcionario extends Pessoa{
    private double salario;
    private String formacao;

    public Funcionario(int idade, String nome, String cpf, double salario, String formacao) {
        super(idade, nome, cpf);
        this.salario = salario;
        this.formacao = formacao;
    }

    public Funcionario() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public double getBonificacao(){
        return this.salario * 0.05;
    }


}
