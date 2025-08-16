package Atividades.Atividade2;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws Exception{
        Relatorio rel = new Relatorio("Relatorio de vendas - Agosto");
        rel.adicionarItem("Total de pedidos: 128");
        rel.adicionarItem("Ticket medio: R$ 152,38");
        rel.adicionarItem("Produto mais vendido: Fone Bluetooth");

        Path pastaSaida = Path.of("saidas");

        DocumentoCreator pdf = new PdfCreator();

        System.out.println("PDF: " + pdf.gerarArquivo(rel, pastaSaida).toAbsolutePath());

        DocumentoCreator docx = new DocxCreator();
        System.out.println("DOCX: " + docx.gerarArquivo(rel, pastaSaida).toAbsolutePath());
    }
}
