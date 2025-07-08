package Aula2.Exercicios.Exercicio3;

public class Aluno {
    public String nome;
    public String RA;
    public Curso curso;

    public Aluno(String nome, String RA, Curso curso) {
        this.nome = nome;
        this.RA = RA;
        this.curso = curso;
    }

    public Aluno(Curso curso) {
        this.curso = curso;
    }
}
