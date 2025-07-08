package Aula2.Atividade2;

public class Loja {
    public static void main(String[] args) {
        Pagamento p1 = new PagamentoCartaoCredito();
        Pagamento p2 = new PagamentoBoleto();
        Pagamento p3 = new PagamentoPix();
        p1.processarPagamento(100.00);
        p2.processarPagamento(250.50);
        p3.processarPagamento(75.00);
    }
}