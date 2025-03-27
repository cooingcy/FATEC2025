package fila.exemplo1;

import java.util.LinkedList;
import java.util.Queue;

//Fila é uma Estrutura de Dados com disciplina de acesso
//FIFO: First in, first out

public class FilaExemplo1 {
    
    public static void main(String[] args) {
        
        // Cria e inicializa uma Fila usando uma ListaLigada (LinkedList)
        Queue<String> fila_de_espera = new LinkedList<>();
        
        // Adiciona novos elementos à Fila (Operação Enfileirar)
        fila_de_espera.add("Matheus");
        fila_de_espera.add("Marcos");
        fila_de_espera.add("Lucas");
        fila_de_espera.add("Joao");
        fila_de_espera.add("Paulo");
        
        System.out.println("Fila: " + fila_de_espera);
        
        // Removendo um elemento da Fila usando remove() (Operacao Desenfileirar)
        // O metodo remove() throws NoSuchElementException se a Queue está vazia
        String nome = fila_de_espera.remove();
        System.out.println("Removido da Fila : " + nome + " | Nova Fila: " + fila_de_espera);
        
        // Removendo um elemento da Fila usando poll()
        // O metodo poll() é similar ao remove(), exceto porque ele retorna null se a Fila esta vazia
        nome = fila_de_espera.poll();
        System.out.println("Removido da Fila : " + nome + " | Nova Fila  : " + fila_de_espera);
    }
}