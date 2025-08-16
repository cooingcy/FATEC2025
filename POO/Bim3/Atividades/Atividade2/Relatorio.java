package Atividades.Atividade2;

import java.util.ArrayList;
import java.util.List;

public class Relatorio {
    private final String titulo;
    private final List<String> itens = new ArrayList<>();
    
    public Relatorio(String titulo){
        this.titulo = titulo;
    }
    public void adicionarItem(String item){
        itens.add(item);
    }

    public String gerarConteudo(){
        StringBuilder sb = new StringBuilder();
        sb.append("# ").append(titulo).append("\n\n");
        for (int i = 0; i < itens.size(); i++){
            sb.append(i + 1).append("").append(itens.get(i)).append("\n");
        }
        return sb.toString();
    }

    public String nomeBaseArquivo(){
        return titulo.toLowerCase().replaceAll("[^a-z0-9]", "-").replaceAll("(^-|-$)", "");
    }
}
