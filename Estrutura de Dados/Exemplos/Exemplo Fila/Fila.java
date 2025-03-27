public class Fila {
    private Object vetor[];
    private int inicio, fim;

    // Cria uma fila vazia
    public Fila() {
        this.vetor = new Object[1000];
        this.inicio = 0;
        this.fim = this.inicio;
    }
    
    public Fila(int maxTam) { //Cria uma fila vazia
        this.vetor = new Object[maxTam];
        this.inicio = 0;
        this.fim = this.inicio;
    }

    public void enfileira(Object valor) throws Exception {
        if ((this.fim + 1) > this.vetor.length) {
            throw new Exception("Erro: A fila esta cheia");
        }
        this.vetor[this.fim] = valor;
        this.fim = (this.fim + 1);
    }

    public Object desenfilera() throws Exception {
        if (this.vazia()) {
            throw new Exception("Erro: A fila esta vazia");
        }
        Object valor = this.vetor[this.inicio];
        this.inicio = (this.inicio + 1) % this.vetor.length;
        return valor;
    }

    public boolean vazia() {
        return (this.inicio == this.fim);
    }

    public void imprime() {
        for (int i = this.inicio; i != this.fim; i++) {
            System.out.println(this.vetor[i].toString() + " | ");
        }
    }
}