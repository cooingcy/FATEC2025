package Aula2.Atividade6;

public class ExemploAssociacao {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Curso curso1 = new Curso("Programação Orientada a Objetos");

        aluno1.mostrarCurso(curso1);
    }
}
