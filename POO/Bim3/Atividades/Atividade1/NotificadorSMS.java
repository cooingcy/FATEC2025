package Atividades.Atividade1;

public class NotificadorSMS implements Observador{
    private final String numero;
    
    public NotificadorSMS(String numero){
        this.numero = numero;
    }
    
//    @Override
    public void atualizar(Mensagem mensagem){
        System.out.println("[SMS] para " + numero + " : " + mensagem.resumo());
    }
}
