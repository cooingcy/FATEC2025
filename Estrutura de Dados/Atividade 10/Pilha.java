public class Pilha {
    private Livro topo, anterior;

    public void push(Livro livro) {
        if (anterior == null) {
            anterior = livro;
        } else {
            topo = anterior;
            topo.setAnterior(livro);
            anterior = topo;
        }
    }

    public void pop() {
        topo = topo.getAnterior();
        anterior = topo;

    }

    public Livro top() {
        return topo;
    }

    public void mostrarLivro() {
        Livro aux = topo;

        while (aux != null) {
            System.out.println(aux.toString());
            aux = aux.getAnterior();
        }

    }
}
