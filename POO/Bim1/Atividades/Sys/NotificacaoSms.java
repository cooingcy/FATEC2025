public class NotificacaoSms extends Notificacao {

    @Override
    public void enviar() {
        System.out.println("Enviando SMS de confirmação...");
        System.out.println("Enviando SMS de alerta...");
        System.out.println("Enviando SMS de promoção...");
    }

}
