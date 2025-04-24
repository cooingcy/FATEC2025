import javax.swing.JOptionPane;

// Classe Pilha
public class Pilha {
    int inicio;
    int topo = -1;
    int tamanho;
    int qntdElementos = 0;
    int p[]; // Array para armazenar os elementos da pilha

    // Construtor da classe Pilha
    public Pilha() {
        inicio = -1;
        tamanho = 10;
        p = new int[tamanho]; // Inicializa o array com o tamanho definido
        qntdElementos = 0;
    }

    // Verifica se a pilha está vazia
    public boolean estaVazia() {
        if (qntdElementos == 0) {
            return true;
        }
        return false;
    }

    // Verifica se a pilha está cheia
    public boolean estaCheia() {
        if (qntdElementos == tamanho) {
            return true;
        }
        return false;
    }

    // Adiciona um novo elemento no topo pilha
    public void empilha(int e) {
        // Só empilha se a pilha ainda não estiver cheia
        if (!estaCheia()) {
            // Se for o primeiro elemento, define o início da pilha
            if (inicio == -1) {
                inicio = 0;
            }
            // Incrementa o topo e armazena o elemento na posição correspondente
            topo++;
            p[topo] = e;
            qntdElementos++;
        }
    }

    // Remove e retorna o elemento no topo da pilha
    public int desempilha() {
        // Só pode remover se não estiver vazia
        if (!estaVazia()) {
            // Armazena o valor do topo em uma variável temporária
            int x = p[topo];
            topo--;
            qntdElementos--;
            return x;
        }
        return -1;
    }

    // Mostra todos os elementos da pilha em ordem decrescente (do topo até a base)
    public void mostrar() {
        String elementos = "";
        for (int i = topo; i >= 0; i--) {
            elementos += p[i] + "  -  ";
        }
        JOptionPane.showMessageDialog(null, elementos);
    }
}