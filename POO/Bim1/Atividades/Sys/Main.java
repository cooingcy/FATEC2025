import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Notificacao> notificacoes = List.of(
            new NotificacaoEmail(),
            new NotificacaoPush(),
            new NotificacaoSms()
        );

        notificacoes.forEach((notificacao) -> {
            notificacao.enviar();
        });
    }
}
