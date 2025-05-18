package Aula2.Atividade2;

public class PagamentoBoleto extends Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Boleto gerado no valor de R$ " + valor + "com vencimento em 5dias.");
    }
}