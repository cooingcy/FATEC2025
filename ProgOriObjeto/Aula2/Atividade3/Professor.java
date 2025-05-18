package Aula2.Atividade3;

public class Professor extends Pessoa {
    private double salario;
    private String disciplina;

    public Professor(String nome, String cpf, String email, double salario, String disciplina) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public void exibirProfessor() {
        exibirDados();
        System.out.println("Salário: R$ " + salario);
        System.out.println("Disciplina: " + disciplina);
    }
}
