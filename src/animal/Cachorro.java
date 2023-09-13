package animal;

public class Cachorro extends Mamifero {
    public Cachorro(int idade, String nome, String especie) {
        super(idade, nome, especie);
    }

    public Cachorro() {
    }

    @Override
    public void Som() {
        System.out.println("O cachorro faz: au au");
    }
}
