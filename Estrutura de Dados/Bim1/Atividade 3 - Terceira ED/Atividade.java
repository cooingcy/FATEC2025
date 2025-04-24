public class Atividade {

    public static void main(String[] args) {
        // Cria uma instância de ListaEncadeada para armazenar os elementos
        ListaEncadeada listaEncadeada = new ListaEncadeada();

        // Cria uma instância da classe Principal para chamar métodos não estáticos
        Atividade atividade = new Atividade();

        atividade.adicionarPessoa(listaEncadeada);

        atividade.remover(listaEncadeada);

        while (listaEncadeada.temProximo()) {
            System.out.println(listaEncadeada.getPosicaoAtual().getValor());
        }
    }

    /**
     * Método para adicionar objetos do tipo Pessoa à lista encadeada.
     * 
     * @param listaEncadeada A lista onde os objetos serão adicionados.
     */
    private void adicionarPessoa(ListaEncadeada listaEncadeada) {
        Pessoa p1 = new Pessoa(1, "João", "jp@gmail.com");
        Pessoa p2 = new Pessoa(2, "Maria", "maria@gmail.com");
        Pessoa p3 = new Pessoa(3, "Bruno", "bruno@gmail.com");
        Pessoa p4 = new Pessoa(4, "José", "jose@gmail.com");
        Pessoa p5 = new Pessoa(5, "Mário", "mario@gmail.com");
        Pessoa p6 = new Pessoa(6, "Eduardo", "dudu@gmail.com");

        listaEncadeada.adicionar(p1);
        listaEncadeada.adicionar(p2);
        listaEncadeada.adicionar(p3);
        listaEncadeada.adicionar(p4);
        listaEncadeada.adicionar(p5);
        listaEncadeada.adicionar(p6);
    }

    /**
     * Método para remover três elementos da lista encadeada.
     * 
     * @param listaEncadeada A lista de onde os elementos serão removidos.
     */
    private void remover(ListaEncadeada listaEncadeada) {
        listaEncadeada.remover();
        listaEncadeada.remover();
        listaEncadeada.remover();
    }

    // Classe Pessoa
    public static class Pessoa {
        private Integer id;
        private String nome; 
        private String email;

        public Pessoa() {
        }

        public Pessoa(Integer id, String nome, String email) {
            this.id = id;
            this.nome = nome;
            this.email = email;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String toString() {
            return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
        }
    }

    // Classe Celula
    public static class Celula {
        private Celula proximo; 
        private Pessoa valor;

        public Celula getProximo() {
            return proximo;
        }

        public void setProximo(Celula proximo) {
            this.proximo = proximo;
        }

        public Pessoa getValor() {
            return valor;
        }

        public void setValor(Pessoa valor) {
            this.valor = valor;
        }
    }

    // Classe ListaEncadeada
    public static class ListaEncadeada {
        private Celula primeiro;
        private Celula ultimo;
        private Celula posicaoAtual;

        public void adicionar(Pessoa valor) {
            Celula celula = new Celula();
            celula.setValor(valor);
            if (primeiro == null && ultimo == null) {
                primeiro = celula;
                ultimo = celula;
            } else {
                ultimo.setProximo(celula);
                ultimo = celula;
            }
        }

        public void remover() {
            if (primeiro.getProximo() != null) {
                Celula celula = this.recuperarPenultimo(this.primeiro);
                ultimo = celula;
                celula.setProximo(null);
            } else {
                primeiro = ultimo = null;
            }
        }

        private Celula recuperarPenultimo(Celula celula) {
            if (celula.getProximo().equals(ultimo)) {
                return celula;
            }
            return recuperarPenultimo(celula.getProximo());
        }

        public boolean temProximo() {
            if (primeiro == null) {
                return false;
            } else if (posicaoAtual == null) {
                posicaoAtual = primeiro;
                return true;
            } else {
                boolean temProximo = posicaoAtual.getProximo() != null ? true : false;
                posicaoAtual = posicaoAtual.getProximo();
                return temProximo;
            }
        }

        public Celula getPosicaoAtual() {
            return this.posicaoAtual;
        }
    }
}
