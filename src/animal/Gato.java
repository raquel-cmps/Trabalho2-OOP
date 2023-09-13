package animal;

public class Gato extends Mamifero{
    public Gato(int idade, String nome, String especie) {
        super(idade, nome, especie);
    }

    public Gato() {
    }

    @Override
    public void Som() {
        System.out.println("O gato faz: miau miau ");
    }
}
