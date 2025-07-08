package Aula2.Exercicios.Exercicio3;

public class Main {
    public static void main(String[] args) {
        // Criando um curso
        Curso curso = new Curso("Ciência da Computação", "Universidade Federal");

        // Criando um aluno e associando ao curso
        Aluno aluno = new Aluno("João Silva", "RA123456", curso);

        // Exibindo os dados
        System.out.println("Aluno: " + aluno.nome);
        System.out.println("RA: " + aluno.RA);
        System.out.println("Curso: " + aluno.curso.nome);
        System.out.println("Universidade: " + aluno.curso.universidade);
    }
}
