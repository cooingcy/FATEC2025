package Aula2.Exercicios.Exercicio4;

public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto("A", 2, 3);
        Ponto p2 = new Ponto("B", 5, 7);

        System.out.println("Distância: " + p1.calcularDistancia(p2));

        Double coefAngular = p1.calcularCoeficienteAngular(p2);
        if (coefAngular != null) {
            System.out.println("Coeficiente angular: " + coefAngular);
        } else {
            System.out.println("Coeficiente angular indefinido (reta vertical).");
        }
    }
}
