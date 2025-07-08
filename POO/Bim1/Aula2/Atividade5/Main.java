package Aula2.Atividade5;

public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Camila", "123.456.789-00", "Matemática");
        Administrativo admin = new Administrativo("Roberto", "987.654.321-00", "RH");

        System.out.println("=== PROFESSOR ===");
        prof.exibirDados();
        prof.ministrarAula();

        System.out.println("\n=== ADMINISTRATIVO ===");
        admin.exibirDados();
        admin.baterPonto();
    }
}

