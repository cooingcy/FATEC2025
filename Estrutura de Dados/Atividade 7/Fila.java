import java.util.Arrays;

public class Fila {

    // Array para armazenar os elementos da fila
    private Object[] objetos = new Object[4];

    // Contador de elementos atualmente na fila
    private int totalDeObjetos = 0;

    // Índice do início da fila (de onde remove)
    private int inicio = 0;

    // Índice do fim da fila (onde insere)
    private int fim = 0;

    // Método para adicionar um elemento ao final da fila
    public void enfileira(Object objeto) {
        // Se a fila está cheia
        if (totalDeObjetos == objetos.length) {
            if (inicio > 0) {
                // Realoca os elementos mais para o início do array
                for (int i = inicio; i < fim; i++) {
                    objetos[i - inicio] = objetos[i];
                }

                // Atualiza os índices após a realocação
                fim = fim - inicio;
                inicio = 0;
            } else {
                // Caso não seja possível realocar, a fila está completamente cheia
                System.out.println("Fila cheia! Não é possível enfileirar.");
                return;
            }
        }

        // Verificação extra de segurança: se ainda não há espaço, sai
        if (fim >= objetos.length) {
            System.out.println("Fila cheia após tentativa de realocação.");
            return;
        }

        // Insere o novo objeto no final da fila
        objetos[fim] = objeto;
        fim++;
        totalDeObjetos++;
    }

    // Método para remover o primeiro elemento da fila
    public Object desenfileira() {
        if (vazio()) {
            System.out.println("Fila vazia!");
            return null;
        }

        // Remove o elemento no índice 'inicio'
        Object removido = objetos[inicio];
        objetos[inicio] = null; // Limpa o espaço
        inicio++;
        totalDeObjetos--;

        // Se a fila ficou vazia, reseta os ponteiros
        if (totalDeObjetos == 0) {
            inicio = 0;
            fim = 0;
        }

        return removido;
    }

    // Retorna o primeiro elemento da fila sem removê-lo
    public Object primeiro() {
        if (!vazio()) {
            return objetos[inicio];
        }
        return null;
    }

    // Retorna o último elemento inserido na fila
    public Object ultimo() {
        if (!vazio()) {
            return objetos[fim - 1];
        }
        return null;
    }

    // Retorna o número de elementos na fila
    public int tamanho() {
        return totalDeObjetos;
    }

    // Retorna true se a fila estiver vazia
    public boolean vazio() {
        return totalDeObjetos == 0;
    }

    // Exibe o estado atual da fila
    public void listar() {
        System.out.println("Fila atual: " + Arrays.toString(objetos));
    }

    // Método principal para testar a fila
    public static void main(String[] args) {
        Fila teste = new Fila();

        // Enfileira alguns elementos
        teste.enfileira("Matheus");
        teste.enfileira("João");
        teste.enfileira("Alex");
        teste.enfileira("Pedro");

        teste.listar();

        // Exibe o primeiro e o último elemento
        System.out.println("Primeiro: " + teste.primeiro());
        System.out.println("Último: " + teste.ultimo());

        // Remove um elemento da fila
        System.out.println("Removido: " + teste.desenfileira());
        System.out.println("Primeiro após remoção: " + teste.primeiro());

        // Enfileira novo elemento após remoção
        teste.enfileira("Bruno");
        teste.listar();

        // Exibe o tamanho atual da fila
        System.out.println("Tamanho: " + teste.tamanho());
    }
}
