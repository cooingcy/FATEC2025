package Atividades.Atividade1;

public class NotificadorEmail implements Observador {
    private final String email;
    
    public NotificadorEmail(String email){
        this.email = email;
    }
    
    @Override
    public void atualizar(Mensagem mensagem){
        System.out.println("[EMAIL] para " + email + " : " + mensagem.resumo());
    }
}