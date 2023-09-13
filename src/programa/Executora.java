package programa;

import Objetos.NovoObjeto;
import Objetos.Objetos;
import animal.Cachorro;
import animal.Gato;
import animal.Mamifero;
import pessoa.*;

import java.util.Scanner;

import static java.lang.System.exit;

public class Executora {
    public static void menu(){
        System.out.println("ESCOLHA UMA OPCAO PARA INTAGIR COM O MENU");
        System.out.println("1. ADICIONAR GATOS");
        System.out.println("2. ADICIONAR CACHORROS");
        System.out.println("3. VISUALIZAR GATOS E CACHORROS ADICIONADOS");
        System.out.println("4. OBTER INFORMACOES SOBRE OS ALUNOS");
        System.out.println("5. OBTER INFORMACOES SOBRE OS FUNCIONARIOS DA ESCOLA");
        System.out.println("6. FECHAR O MENU");
    }

    public static void main(String[] args) {
        Gato[] vetorGato = new Gato[50];
        Cachorro[] vetorCachorro = new Cachorro[50];
        Aluno[] vetorAluno = new Aluno[50];
        Funcionario[] vetorFuncioanrio = new Funcionario[50];

        //POLIMORFISMO
        Funcionario professor = new Professor();
        Funcionario diretor = new Diretor();
        Funcionario secretario = new Secretario();

        Scanner src = new Scanner(System.in);
        System.out.println("OLA, SEJA BEM VINDO!");
        System.out.println();
        menu();
        int op = src.nextInt();
        if(op == 6){
            System.out.println("PROGRAMA FINALIZADO");
            exit(0);
        }

        int quantGatos = 0;
        int quantCachorro = 0;

        do{
            switch (op) {
                case 1 -> {
                    System.out.println("Informe a quantidade de gatos que deseja adicionar");
                    quantGatos = src.nextInt();
                    if (quantGatos > 0) {
                        for (int i = 0; i < quantGatos; i++) {
                            vetorGato[i] = NovoObjeto.addGato();
                            System.out.println("Gato adicionado com sucesso!");
                            System.out.println();
                        }
                    } else {
                        System.out.println("NUMERO INVALIDO, POR FAVOR TENTE OUTRA VEZ");
                    }
                    menu();
                    op = src.nextInt();
                }
                case 2 -> {
                    System.out.println("Informe a quantidade de cachorros que deseja adicionar");
                    quantCachorro = src.nextInt();
                    if (quantCachorro > 0) {
                        for (int i = 0; i < quantCachorro; i++) {
                            vetorCachorro[i] = NovoObjeto.addCachorro();
                            System.out.println("Cachorro adicionado com sucesso!");
                            System.out.println();
                        }
                    } else {
                        System.out.println("NUMERO INVALIDO, POR FAVOR TENTE OUTRA VEZ");
                    }
                    menu();
                    op = src.nextInt();
                }
                case 3 -> {
                    //IMPRIMINDO GATOS
                    System.out.println("GATOS");
                    for (int i = 0; i < quantGatos; i++) {
                        System.out.println("Nome: " + vetorGato[i].getNome());
                        System.out.println("Idade: " + vetorGato[i].getIdade());
                        System.out.println();
                    }
                    Mamifero gato = new Gato();
                    gato.Som();
                    System.out.println("------------------------------------------------------------------------------");

                    //IMPRIMINDO CACHORROS
                    System.out.println("CACHORROS");
                    for (int i = 0; i < quantCachorro; i++) {
                        System.out.println("Nome: " + vetorCachorro[i].getNome());
                        System.out.println("Idade: " + vetorCachorro[i].getIdade());
                        System.out.println();
                    }
                    Mamifero cachorro = new Cachorro();
                    cachorro.Som();
                    System.out.println("------------------------------------------------------------------------------");
                    menu();
                    op = src.nextInt();
                }
                case 4 -> {
                    vetorAluno[1] = Objetos.aluno1;
                    vetorAluno[2] = Objetos.aluno2;
                    vetorAluno[3] = Objetos.aluno3;
                    vetorAluno[4] = Objetos.aluno4;
                    vetorAluno[5] = Objetos.aluno5;
                    vetorAluno[6] = Objetos.aluno6;

                    //IMPRIMINDO ALUNOS
                    for (int i = 1; i < 7; i++) {
                        System.out.println("INFORMACOES SOBRE O ALUNO " + i);
                        System.out.println("NOME: " + vetorAluno[i].getNome());
                        System.out.println("IDADE: " + vetorAluno[i].getIdade());
                        System.out.println("CPF: " + vetorAluno[i].getCpf());
                        System.out.println("MATRICULA: " + vetorAluno[i].getMatricula());
                        System.out.println("PERIODO: " + vetorAluno[i].getPeriodo());
                        System.out.println("--------------------------------------------------------------------------");
                    }
                    menu();
                    op = src.nextInt();
                }
                case 5 -> {
                    vetorFuncioanrio[1] = Objetos.professor;
                    vetorFuncioanrio[2] = Objetos.diretor;
                    vetorFuncioanrio[3] = Objetos.secretario;
                    for (int i = 1; i < 4; i++) {
                        System.out.println("INFORMACAO SOBRE O FUNCIONARIO");
                        System.out.println("NOME: " + vetorFuncioanrio[i].getNome());
                        System.out.println("IDADE: " + vetorFuncioanrio[i].getIdade());
                        System.out.println("CPF: " + vetorFuncioanrio[i].getCpf());
                        System.out.println("Salario: " + vetorFuncioanrio[i].getSalario());
                        System.out.println("Formacao: " + vetorFuncioanrio[i].getFormacao());
                        System.out.println("--------------------------------------------------------------------------");
                    }
                    System.out.println("Bonificaçao do professor: " + professor.getBonificacao());
                    System.out.println("Bonificaçao do diretor: " + diretor.getBonificacao());
                    System.out.println("Bonificaçao do secretario " + secretario.getBonificacao());
                    System.out.println();
                    menu();
                    op = src.nextInt();
                }
                default -> {
                    System.out.println("OPCAO INVALIDA!");
                    menu();
                    op = src.nextInt();
                }
            }


        }while (op != 6);
        System.out.println("PROGRAMA FINALIZADO");
    }
}
