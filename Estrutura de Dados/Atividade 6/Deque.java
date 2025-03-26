public class Deque {

    private No inicio = null;
    private No fim = null;

    // Construtor
    public Deque() {
    }

    // Insere um elemento no final da fila (lado esquerdo)
    public void EnqueueL(Object item) {
        No novoNo = new No();
        novoNo.item = item;
        novoNo.proximo = null;

        // Se a fila estiver vazia, o novo nó é tanto o início quanto o fim
        if (this.inicio == null) {
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            // Caso contrário, adiciona o novo nó após o último e atualiza o ponteiro do fim
            this.fim.proximo = novoNo;
            this.fim = novoNo;
        }
    }

    // Insere um elemento no início da fila (lado direito)
    public void EnqueueR(Object item) {
        No novoNo = new No();
        novoNo.item = item;
        novoNo.proximo = this.inicio;

        // Se a estrutura estava vazia, atualiza também o fim
        if (this.inicio == null) {
            this.fim = novoNo;
        }

        // Atualiza o início para o novo nó
        this.inicio = novoNo;
    }

    // Remove e retorna o elemento do início da fila
    public Object DequeueL() throws Exception {
        if (this.vazio()) {
            // Se a fila estiver vazia, lança exceção
            throw new Exception("A fila esta vazia");
        } else {
            // Guarda o item do início
            Object InicioItem = this.inicio.item;

            // Move o ponteiro de início para o próximo nó
            this.inicio = this.inicio.getProximo();

            return InicioItem;
        }
    }

    // Remove e retorna o elemento do fim da fila (lado direito)
    public Object DequeueR() throws Exception {

        // Verifica se a fila está vazia
        if (this.vazio()) {
            throw new Exception("A fila está vazia");
        }

        Object item;

        // Caso especial: se houver apenas um elemento na fila
        if (this.inicio == this.fim) {
            item = this.inicio.getItem();
            this.inicio = null;
            this.fim = null;
        } else {
            // Caso geral: percorre a fila até o penúltimo nó
            No atual = this.inicio;

            // Loop para quando o próximo nó for o último (fim)
            while (atual.getProximo() != this.fim) {
                atual = atual.getProximo();
            }

            item = this.fim.getItem();
            atual.setProximo(null);
            this.fim = atual;
        }

        return item;
    }

    // Verifica se a fila está vazia
    public boolean vazio() {
        return this.inicio == null;
    }

    // Imprime todos os itens da fila
    public void imprime() {
        // Percorre os nós a partir do início e imprime os itens
        for (No aux = this.inicio; aux != null; aux = aux.getProximo()) {
            System.out.println(aux.getItem());
        }
    }
}
