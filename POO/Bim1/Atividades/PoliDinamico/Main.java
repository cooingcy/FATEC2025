public class Main {

    public static void main(String[] args) {
        Atendimento atendimento;

        atendimento = new AtendimentoVendas();
        atendimento.responder();

        atendimento = new AtendimentoSuporte();
        atendimento.responder();

        atendimento = new AtendimentoFinanceiro();
        atendimento.responder();     
    }

}
