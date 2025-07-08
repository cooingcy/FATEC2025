public class TestePolimorfismo {
    public static void main(String[] args) {
        Pessoa p1 = new Pai();
        Pessoa p2 = new Marido();
        Pessoa p3 = new Funcionario();
        p1.desempenharPapel();
        p2.desempenharPapel();
        p3.desempenharPapel();
    }
}