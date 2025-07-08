package Aula2.Atividade3;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lucas Silva", "123.456.789-00", "lucas@email.com", "20231001", "Engenharia");
        Professor professor = new Professor("Dra. Ana", "987.654.321-00", "ana@email.com", 8500.00, "POO");

        System.out.println("=== Dados do Aluno ===");
        aluno.exibirAluno();

        System.out.println("\n=== Dados do Professor ===");
        professor.exibirProfessor();
    }
}