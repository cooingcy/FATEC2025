public class HeapSortExample {

    // Método responsável por ordenar o vetor usando o algoritmo Heap Sort
    public static void sort(int[] vetor) {
        int tamanho = vetor.length;
        int i = tamanho / 2, pai, filho, t;

        // Loop principal do algoritmo
        while (true) {
            if (i > 0) {
                // Construção inicial do heap: percorre da metade do vetor até o início
                i--;
                t = vetor[i];
            } else {
                // Após o heap estar construído, começa a extração do maior elemento
                tamanho--;
                if (tamanho <= 0) return; // Quando não há mais elementos para ordenar, encerra
                t = vetor[tamanho];       // Último elemento do heap é movido para a raiz
                vetor[tamanho] = vetor[0]; // O maior elemento (na raiz) vai para sua posição final
            }

            pai = i; // Índice do pai no heap
            filho = (i * 2) + 1; // Calcula o índice do filho esquerdo

            // Desce pelo heap para reposicionar o valor 't' na posição correta
            while (filho < tamanho) {
                // Verifica se existe o filho direito e se ele é maior que o filho esquerdo
                if ((filho + 1 < tamanho) && (vetor[filho + 1] > vetor[filho])) 
                    filho++; // Seleciona o filho maior

                // Se o maior filho for maior que 't', move o filho para cima
                if (vetor[filho] > t) {
                    vetor[pai] = vetor[filho]; // Substitui o valor do pai pelo filho
                    pai = filho;               // Atualiza o índice do pai
                    filho = pai * 2 + 1;       // Calcula o próximo filho
                } else {
                    break; // Se 't' já está na posição correta, sai do loop
                }
            }
            vetor[pai] = t; // Coloca 't' em sua posição correta no heap
        }
    }

    public static void main(String[] args) {
        int[] vetor = {5, 3, 8, 4, 1, 9, 2};

        // Exibe o vetor antes da ordenação
        System.out.println("Antes da ordenação:");
        for (int v : vetor) System.out.print(v + " ");

        // Chama o método de ordenação
        sort(vetor);

        // Exibe o vetor após a ordenação
        System.out.println("\nDepois da ordenação:");
        for (int v : vetor) System.out.print(v + " ");
    }
}
