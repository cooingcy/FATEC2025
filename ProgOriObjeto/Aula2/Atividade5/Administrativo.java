package Aula2.Atividade5;

public class Administrativo extends Funcionario {
    private String setor;

    public Administrativo(String nome, String cpf, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.setor = setor;
    }

    public void baterPonto() {
        System.out.println(nome + " registrou o ponto no setor de " + setor);
    }
}

