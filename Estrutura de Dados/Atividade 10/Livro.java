public class Livro {
    // Atributos
    private String nome;
    private int ano;
    private double preco;
    private Livro anterior;

    // Método Construtor
    public Livro(String nome, int ano, double preco, Livro autor) {
        this.nome = nome;
        this.ano = ano;
        this.preco = preco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public Livro getAnterior() {
        return anterior;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setAnterior(Livro anterior) {
        this.anterior = anterior;
    }

    // Método toString
    @Override
    public String toString() {
        return "Livro{" + "nome=" + nome + ", ano=" + ano + ", preco=" + preco + '}';
    }
}
