package Aula2.Atividade2;

public class PagamentoCartaoCredito extends Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + "processado no cartão de crédito.");
    }
}