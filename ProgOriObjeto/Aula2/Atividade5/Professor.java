package Aula2.Atividade5;

public class Professor extends Funcionario {
    private String disciplina;

    public Professor(String nome, String cpf, String disciplina) {
        this.nome = nome;
        this.cpf = cpf;
        this.disciplina = disciplina;
    }

    public void ministrarAula() {
        System.out.println(nome + " está ministrando a disciplina de " + disciplina);
    }
}
