package Atividades.Atividade2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class DocxDocumento implements Documento {
    @Override
    public Path salvar(String baseName, String conteudo, Path pasta) throws IOException {
        Path arq = pasta.resolve(baseName + ".docx");
        Files.writeString(arq, "DOCX SIMPLIFICADO\n\n" + conteudo, StandardCharsets.UTF_8);
        return arq;
    }
    @Override
    public String extensao(){
        return ".docx";
    }

}
