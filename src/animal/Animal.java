package animal;
//CLASSE MÃE
public abstract class Animal {
    private int idade;
    private String nome;


    public Animal(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public Animal() {
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
