public class Main {

    public static void main(String[] args) {
        Pagamento pagamento1 = new Pagamento();
        Pagamento pagamento2 = new PagamentoBoleto();
        Pagamento pagamento3 = new PagamentoCartao();

        pagamento1.processarPagamento(150.0);
        pagamento2.processarPagamento(500.0);
        pagamento3.processarPagamento(250.0);
    }

}