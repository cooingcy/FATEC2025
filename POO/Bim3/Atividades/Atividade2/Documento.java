package Atividades.Atividade2;

import java.io.IOException;
import java.nio.file.Path;

public interface Documento {
    Path salvar(String baseName, String contudo, Path pasta) throws IOException;
    String extensao();
}
