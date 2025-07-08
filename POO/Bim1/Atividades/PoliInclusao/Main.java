public class Main {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ana", 3200.0);

        Funcionario f2 = new Gerente("Marcos", 5200.0);

        Funcionario f3 = new Diretor("Fernanda", 11000.0);

        f1.exibirInformacoes();
        f2.exibirInformacoes();
        f3.exibirInformacoes();
    }

}
