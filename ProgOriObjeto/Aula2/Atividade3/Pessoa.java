package Aula2.Atividade3;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String email;

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
    }
}