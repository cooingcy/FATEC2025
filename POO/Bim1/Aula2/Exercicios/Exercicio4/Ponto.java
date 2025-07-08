package Aula2.Exercicios.Exercicio4;

public class Ponto {
    private String nome;
    private int x;
    private int y;

    // Construtor com parâmetros
    public Ponto(String nome, int x, int y) {
        this.nome = nome;
        this.x = x;
        this.y = y;
    }

    // Método para calcular a distância entre dois pontos
    public double calcularDistancia(Ponto outro) {
        int deltaX = outro.x - this.x;
        int deltaY = outro.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Método para calcular o coeficiente angular entre dois pontos
    public Double calcularCoeficienteAngular(Ponto outro) {
        int deltaX = outro.x - this.x;
        int deltaY = outro.y - this.y;

        if (deltaX == 0) {
            return null; // Coeficiente angular indefinido (reta vertical)
        }

        return (double) deltaY / deltaX;
    }

    // Getters para os atributos, se necessário
    public String getNome() {
        return nome;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
