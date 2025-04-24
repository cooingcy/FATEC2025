public class Fila {
    public class No {
        Object item;
        No prox;
    }

    private No inicio;
    private No fim;

    public Fila() {
        this.inicio = new No();
        this.fim = this.inicio;
        this.inicio.prox = null;
    }

    public void enfileira(Object valor) {
        this.fim.prox = new No();
        this.fim = this.fim.prox;
        this.fim.item = valor;
        this.fim.prox = null;
    }

    public Object desinfileira() throws Exception {
        Object valor = null;
        if (this.vazia()) {
            throw new Exception("Erro: A fila esta vazia");
        }
        this.inicio = this.inicio.prox;
        valor = this.inicio.prox;
        return valor;
    }

    public boolean vazia() {
        return (this.inicio == this.fim);
    }

    public void imprime() {
        No aux;
        aux = this.inicio.prox;
        while (aux != null)
            ;
    }

    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(10);
        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(10);
        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(10);
        fila.enfileira(10);

        fila.imprime();
    }

}