package Aula2.Atividade4;

public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Carlos", "111.222.333-44", "01/02/2020", "POO");
        Administrativo admin = new Administrativo("Juliana", "555.666.777-88", "15/03/2018", "Financeiro");

        System.out.println("=== PROFESSOR ===");
        prof.exibirDados();
        prof.ministrarAula();

        System.out.println("\n=== ADMINISTRATIVO ===");
        admin.exibirDados();
        admin.emitirRelatorio();
    }
}
