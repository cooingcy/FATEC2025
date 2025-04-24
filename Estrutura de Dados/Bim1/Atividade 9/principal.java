public class principal {
    public static void main(String[] args) {
        p1 teste = new p1();
        p_aux t = new p_aux();
        p2 tt = new p2();

        teste.empilha('K');
        teste.empilha('a');
        teste.empilha('i');
        teste.empilha('a');
        teste.empilha('k');

        teste.mostrar();

        System.out.println("Índice do topo: " + teste.topo);

        System.out.println("Desempilhando: " + teste.desempilha());

        teste.mostrar();
    }
}
