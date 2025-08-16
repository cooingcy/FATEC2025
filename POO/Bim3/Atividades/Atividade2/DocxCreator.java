package Atividades.Atividade2;

public class DocxCreator extends DocumentoCreator{
    @Override
    protected Documento criarDocumento(){
        return new DocxDocumento();
    }

}
