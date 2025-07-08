public class Fatura {

    public void emitirFatura(double valor) {
        System.out.println("Fatura emitida no valor de R$ " + valor);
    }

    public void emitirFatura(double valor, String cliente) {
        System.out.println("Fatura para " + cliente + " no valor de R$ " + valor);
    }

    public void emitirFatura(double valor, String cliente, int parcelas) {
        double valorParcela = valor / parcelas;
        System.out.println(
            "Fatura para " + cliente + " no valor total de R$ " + valor
            + " em " + parcelas + " parcelas de R$ " + valorParcela
        );
    }

}
