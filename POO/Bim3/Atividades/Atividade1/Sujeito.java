package Atividades.Atividade1;

public interface Sujeito {
    void inscrever(Observador o);
    void desinscrever(Observador o);
    void notificar(Mensagem m);
}
