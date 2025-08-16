package Atividades.Atividade2;

public class PdfCreator extends DocumentoCreator {
    @Override
    protected Documento criarDocumento(){
        return new PdfDocumento();
    }

}
