public class No {
    
    Object item;
    No proximo;

    // Construtor
    public No() {
    }

    // Método getter que retorna o item armazenado.
    public Object getItem() {
        return this.item;
    }

    // Método getter que retorna o próximo nó da sequência.
    public No getProximo() {
        return this.proximo;
    }

    // Método setter que define o item a ser armazenado.
    public void setItem(Object item) {
        this.item = item;
    }

    // Método setter que define o próximo nó da sequência.
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
