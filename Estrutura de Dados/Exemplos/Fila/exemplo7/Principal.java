package fila.exemplo7;

import java.util.LinkedList;
import java.util.Queue;

public class Principal {

    public static void main(String[] args) {

        //Criação da fila de Estudantes
        Queue<Estudante> filaDeEstudante = new LinkedList<>();
        Estudante e1 = new Estudante("Peter");
        Estudante e2 = new Estudante("James");
        Estudante e3 = new Estudante("John");

        ///Enfileirar os estudantes
        filaDeEstudante.add(e1);
        filaDeEstudante.add(e2);
        filaDeEstudante.add(e3);

        //imprimindo todos os elementos e os removendo da lista
        System.out.print("Fila de estudantes: \n");
        for (int i = 0; i < filaDeEstudante.size() + i; i++) {
            System.out.print(filaDeEstudante.poll().getNome() + " | ");
        }

        //Enfileirar os alunos novamente
        filaDeEstudante.add(e1);
        filaDeEstudante.add(e2);
        filaDeEstudante.add(e3);

        //Removendo e1
        System.out.println("\nRemovendo " + e1.getNome());
        filaDeEstudante.remove(e1);

        //imprimindo os elementos da lista novamente
        System.out.print("\nFila: \n");
        for (int i = 0; i < filaDeEstudante.size() + i; i++) {
            System.out.print(filaDeEstudante.poll().getNome() + " | ");
        }
    }
}
