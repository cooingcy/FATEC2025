package Aula2.Exercicios.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos dados do produto
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int qntdEstoque = scanner.nextInt();

        // Criando o objeto Produto
        Produto produto = new Produto(nome, preco, qntdEstoque);

        // Exibindo os detalhes
        System.out.println("\n--- Detalhes do produto ---");
        produto.mostrarDetalhes();

        // Adicionando unidades ao estoque
        System.out.print("\nDigite a quantidade a adicionar no estoque: ");
        int adicionar = scanner.nextInt();
        produto.adicionar(adicionar);

        // Removendo unidades do estoque
        System.out.print("Digite a quantidade a remover do estoque: ");
        int remover = scanner.nextInt();
        produto.remover(remover);

        // Exibindo os detalhes atualizados
        System.out.println("\n--- Estoque atualizado ---");
        produto.mostrarDetalhes();

        scanner.close();
    }
}

