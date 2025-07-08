public class Adm extends Funcionario {

    private String setor;

    public Adm(String nome, String cpf, String dataAdmissao, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.setor = setor;
    }

    public void emitirRelatorio() {
        System.out.println(nome + " emitiu um relatório do setor " + setor);
    }
}
