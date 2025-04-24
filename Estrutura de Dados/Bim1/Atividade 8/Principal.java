public class Principal {
    public static void main(String[] args) {
        Pilha teste = new Pilha();

        teste.empilha(1);
        teste.empilha(2);
        teste.empilha(3);
        teste.empilha(4);
        teste.empilha(5);

        teste.mostrar();

        System.out.println("Índice do topo: " + teste.topo);

        System.out.println("Desempilhando: " + teste.desempilha());

        teste.mostrar();
    }
}
