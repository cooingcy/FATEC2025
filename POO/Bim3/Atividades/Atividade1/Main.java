package Atividades.Atividade1;

public class Main {
    public static void main(String[] args){
        FeedNotificacoes feed = new FeedNotificacoes();
        
        Observador email = new NotificadorEmail("aluno@exemplo.com");
        Observador sms = new NotificadorSMS("+55 11 91234-5678");
        
        feed.inscrever(email);
        feed.inscrever(sms);
        
        feed.publicar(new Mensagem("Aviso de Aula", "Hoja começaremos com padrões GoF"));
        feed.publicar(new Mensagem("Material", "Slide atualizados no AVA"));
        
        feed.desinscrever(sms);
        feed.publicar(new Mensagem("Lembrete", "Entrega do exercicio até sexta"));
    }
}
