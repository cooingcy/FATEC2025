public class Main {

    public static void main(String[] args) {
        Fatura fatura = new Fatura();

        fatura.emitirFatura(500.0);

        fatura.emitirFatura(750.0, "José");

        fatura.emitirFatura(1200.0, "Ana", 4);
    }

}
