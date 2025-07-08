public class Main {

    public static void main(String[] args) {
        Professor professor = new Professor("Ana", "321.654.987-00", "matemática");

        Adm adm = new Adm("Mariana", "987.654.321-00", "05-08-2010", "Recursos Humanos");

        System.out.println("=== PROFESSOR ===");
        professor.exibirDados();
        professor.ministrarAula();

        System.out.println("=== ADMINISTRADOR ===");
        adm.exibirDados();
        adm.emitirRelatorio();
    }
}
