package Aula2.Atividade3;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String nome, String cpf, String email, String matricula, String curso) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void exibirAluno() {
        exibirDados();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}