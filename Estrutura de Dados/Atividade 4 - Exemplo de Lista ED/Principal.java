public class Principal {
    public static void main(String[] args) {
        Lista lista = new Lista();

        // Criando livros
        Livro livro1 = new Livro("O Senhor dos Anéis", 1954, 99.90, null);
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", 1997, 39.90, null);
        Livro livro3 = new Livro("O Hobbit", 1937, 49.90, null);

        // Adicionando livros à lista
        lista.adicionar(livro1);
        lista.adicionar(livro2);
        lista.adicionar(livro3);

        // Exibindo livros da lista
        System.out.println("Lista de Livros:");
        lista.mostrarLivros();

        // Removendo um livro e mostrando novamente
        System.out.println("\nRemovendo o último livro adicionado...");
        lista.remover();
        
        System.out.println("\nLista após remoção:");
        lista.mostrarLivros();
    }
}