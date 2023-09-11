package pessoa;

public class Aluno extends Pessoa{
    private double matricula;
    private String periodo;

    public Aluno(int idade, String nome, String cpf, double matricula, String periodo) {
        super(idade, nome, cpf);
        this.matricula = matricula;
        this.periodo = periodo;
    }

    public Aluno() {
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

}
