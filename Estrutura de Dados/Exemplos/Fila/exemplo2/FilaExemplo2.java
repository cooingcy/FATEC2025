package fila.exemplo2;

import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo2 {

    public static void main(String[] args) {
        
        Queue<String> fila_de_espera = new LinkedList<>();

        //add é equivalente ao método enfileira() 
        fila_de_espera.add("Ana");
        fila_de_espera.add("Maria");
        fila_de_espera.add("Ester");
        fila_de_espera.add("Debora");

        System.out.println("Fila : " + fila_de_espera);

        // Verifica se a fila está vazia
        System.out.println("A fila está vazia? : " + fila_de_espera.isEmpty());

        // Encontre o tamanho da Fila
        System.out.println("Tamanho da Fila : " + fila_de_espera.size());

        //Verifica se a fila contém um determinado elemento
        String nome = "Ester";
        if(fila_de_espera.contains(nome)) {
            System.out.println("Fila contem " + nome);
        } else {
            System.out.println("Fila não contem " + nome);
        }

        // Obtem o elemento da frente da fila e usa-o, sem remove-lo usando o método element()
        // O método element() throws NoSuchElementException se a Fila está vazia
        String primeira_pessoa_na_fila_de_espera =  fila_de_espera.element();
        System.out.println("Primeira Pessoa da Fila (element()) : " + primeira_pessoa_na_fila_de_espera);

        System.out.println("Fila : " + fila_de_espera);
        
        // Obtem o elemento da frente da Fila sem remove-lo usando o método peek()
        // O método peek() é similar ao element() exceto porque ele retorna null se a pilha estiver vazia
        primeira_pessoa_na_fila_de_espera = fila_de_espera.peek();
        System.out.println("Primeira Pessoa da Fila (peek()) : " + primeira_pessoa_na_fila_de_espera);
        System.out.println("Fila : " + fila_de_espera);
    }
}