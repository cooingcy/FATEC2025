package Aula2.Exercicios.Exercicio1;

public class Produto {
    public String nome;
    public double preco;
    public int qntdEstoque;

    public Produto(String nome, double preco, int qntdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qntdEstoque = qntdEstoque;
    }

    public void adicionar(int qntde) {
        this.qntdEstoque += qntde;
    }

    public void remover(int qntde) {
        if (this.qntdEstoque >= qntde) {
            this.qntdEstoque -= qntde;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    public void mostrarDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade em estoque: " + this.qntdEstoque);
    }

}
