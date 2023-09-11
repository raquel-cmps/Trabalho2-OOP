package animal;

public class Mamifero extends Animal {
    private String especie;

    public Mamifero(int idade, String nome, String especie) {
        super(idade, nome);
        this.especie = especie;
    }

    public Mamifero() {
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void Som(){
        System.out.println("Os mamiferos fazem sons");
    }
}
