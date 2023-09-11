package Objetos;

import pessoa.Aluno;
import pessoa.Diretor;
import pessoa.Professor;
import pessoa.Secretario;

public class Objetos {
    //AQUI ESTÃO OS OBJETOS QUE JA FORAM CRIADOS

    //ALUNOS
    public static Aluno aluno1 = new Aluno(12, "Bruno","104.235.436-78", 4589, "matutino");
    public static Aluno aluno2 = new Aluno(13, "Fernanda","900.873.875.90", 9123, "matutino");
    public static Aluno aluno3 = new Aluno(14, "Julia", "600.200.765.90", 6432, "matutino");
    public static Aluno aluno4 = new Aluno(12, "Roberto","680.254.983.08", 2245, "vespertino");
    public static Aluno aluno5 = new Aluno(13, "Gabriela","103.200.769.25", 9123, "matutino");
    public static Aluno aluno6 = new Aluno(15, "Pedro", "203.201.786.24", 8123, "vespertino");

    //FUNCIONARIOS
    public static Professor professor = new Professor(40, "Marcelo - professor","204.678.340-35", 3400, "matematica");
    public static Diretor diretor = new Diretor(48, "Juliana - diretora","920.763.902-83", 4800, "Lingua Portuguesa, Pedagogia");
    public static Secretario secretario = new Secretario(27, "Jonas - secretario","324.007.762-87", 2300, "Administracao");


}
