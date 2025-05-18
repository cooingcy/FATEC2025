package Aula2.Exercicios.Exercicio2;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria() {
        this.numeroConta = 0;
        this.nomeTitular = "Desconhecido";
        this.saldo = 0.0;
    }

    public ContaBancaria(int numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saque inválido! Verifique o saldo ou o valor solicitado.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }
}
