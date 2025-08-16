package Atividades.Atividade2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public abstract  class DocumentoCreator {
    protected abstract Documento criarDocumento();

    public Path gerarArquivo(Relatorio relatorio, Path pasta) throws IOException{
        Files.createDirectories(pasta);
        Documento doc = criarDocumento();
        return doc.salvar(relatorio.nomeBaseArquivo(), relatorio.gerarConteudo(), pasta);
    }

}
