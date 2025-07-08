public class Main {

    public static void main(String[] args) {
        Professor professor = new Professor(
            "Carlos",
            "555.666.777-88",
            "10-03-2012",
            "história"
        );
        Adm adm = new Adm(
            "Fernanda",
            "888.777.666-55",
            "22-09-2015",
            "Tecnologia da Informação"
        );

        System.out.println("=== PROFESSOR ===");
        professor.exibirDados();
        professor.ministrarAula();

        System.out.println("=== ADMINISTRADOR ===");
        adm.exibirDados();
        adm.emitirRelatorio();
    }
}