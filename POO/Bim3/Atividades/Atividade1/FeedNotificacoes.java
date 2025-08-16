package Atividades.Atividade1;

import java.util.ArrayList;
import java.util.List;

public class FeedNotificacoes implements Sujeito {
    private final List<Observador> observadores = new ArrayList<>();
     
    @Override
    public void inscrever(Observador o){
        observadores.add(o);
    }
    
    @Override
    public void desinscrever(Observador o){
        observadores.add(o);
    }
    @Override
    public void notificar(Mensagem m){
        for (Observador o : observadores){
            o.atualizar(m);
        }
    }
    public void publicar(Mensagem m){
        notificar(m);
    }
}
