package Objetos;

import animal.*;

import java.util.Scanner;

public class NovoObjeto {
    //novos animais digitado pelo usuario

    static Scanner src = new Scanner(System.in);

    public static Gato addGato(){
        Gato g = new Gato();

        System.out.print("Infome o nome do gatinho: ");
        g.setNome(src.next());

        System.out.print("Infome a idade do gatinho: ");
        g.setIdade(src.nextInt());

        return g;
    }

    public static Cachorro addCachorro(){
        Cachorro c = new Cachorro();

        System.out.print("Infome o nome do cachorrinho: ");
        c.setNome(src.next());

        System.out.print("Infome a idade do cachorrinho: ");
        c.setIdade(src.nextInt());

        return c;
    }
}
