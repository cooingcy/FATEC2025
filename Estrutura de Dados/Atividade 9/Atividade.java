import javax.swing.JOptionPane;

// Classe Pilha
public class Atividade {
    int inicio;
    int topo = -1;
    int tamanho;
    int qntdElementos = 0;
    int p1[];
    int p_aux[]; 
    int p2[];


    // Construtor da classe Pilha
    public Atividade() {
        inicio = -1;
        tamanho = 10;
        p1 = new int[tamanho];
        p_aux = new int [tamanho ];
        p2 = new int [tamanho];
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
            if (inicio == -1) {
                inicio = 0;
            }
            topo++;
            p[topo] = e;
            qntdElementos++;
        }
    }

    // Remove e retorna o elemento no topo da pilha
    public char desempilha() {
        // Só pode remover se não estiver vazia
        if (!estaVazia()) {
            // Armazena o valor do topo em uma variável temporária
            int x = p1[topo];
            topo--;
            qntdElementos--;
            return x;
        }
        return -1;
    }

    while(!p_aux.isEmpty()){
        int y = p2.empilha(p_aux.desempilha()); 
    }





    public int compara(){
        if( p1 == p2){
            System.err.println("é um paligrimo");
        }
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