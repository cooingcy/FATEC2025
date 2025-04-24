package fila.exemplo6;

public class Principal {

    public static void main(String[] args) {
        Fila fila = new Fila();
        try {
            fila.enfileira("Matheus");
            fila.enfileira("Marcos");
            fila.enfileira("Lucas");
            fila.enfileira("João");
            fila.enfileira("Pedro");
            fila.enfileira("Tiago");
            fila.enfileira("Felipe");
            fila.imprime();
            
            System.out.println("Desenfileirou: " + fila.desenfileira());
            
            fila.imprime();
            
            fila.enfileira("Paulo");
            fila.enfileira("Temóteo");
            
            System.out.println("Desenfileirou: " + fila.desenfileira());
            System.out.println("Desenfileirou: " + fila.desenfileira());
            System.out.println("Desenfileirou: " + fila.desenfileira());
            System.out.println("Desenfileirou: " + fila.desenfileira());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        fila.imprime();
    }
}
