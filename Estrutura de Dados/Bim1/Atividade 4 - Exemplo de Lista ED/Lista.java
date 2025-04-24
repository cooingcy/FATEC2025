public class Lista {
    // Atributos
    private Livro topo, anterior;

    // Construtor
    public void adicionar(Livro livro) {
        if (anterior == null) {
            anterior = livro;
        } else {
            topo = livro;
            topo.setAnterior(anterior);
            anterior = topo;
        }
    }

    // Método para remover o último livro adicionado
    public void remover() {
        topo = topo.getAnterior();
        anterior = topo;
    }

    // Método para retornar o livro do topo
    public Livro topo() {
        return topo;
    }

    // Método para mostrar os livros da lista
    public void mostrarLivros() {
        Livro aux = topo;
        while (aux != null) {
            System.out.println(aux.toString());
            aux = aux.getAnterior();
        }
    }
}
