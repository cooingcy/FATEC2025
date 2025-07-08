public class NotificacaoEmail extends Notificacao {

    @Override
    public void enviar() {
        System.out.println("Enviando e-mail para cliente...");
        System.out.println("E-mail enviado com sucesso!");
        System.out.println("Notificação por e-mail registrada no sistema.");
    }

}
