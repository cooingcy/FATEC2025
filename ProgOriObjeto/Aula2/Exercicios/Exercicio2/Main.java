package Aula2.Exercicios.Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coletando informações da conta
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir o \n

        System.out.print("Digite o nome do titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        // Criando a conta
        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldoInicial);

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Exibir saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.exibirSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
