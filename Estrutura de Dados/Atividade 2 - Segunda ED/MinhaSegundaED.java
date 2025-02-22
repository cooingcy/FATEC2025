public class MinhaSegundaED {
    private String[] nomes = new String[26];
    public int total_nomes = 0;

    // Retorna o índice correspondente à posição no vetor com base na primeira letra do nome
    public int getIndice(String nome) {
        if (validaNome(nome)) {
            char primeiraLetra = Character.toUpperCase(nome.charAt(0));
            switch (primeiraLetra) {
                case 'A': return 0;
                case 'B': return 1;
                case 'C': return 2;
                case 'D': return 3;
                case 'E': return 4;
                case 'F': return 5;
                case 'G': return 6;
                case 'H': return 7;
                case 'I': return 8;
                case 'J': return 9;
                case 'K': return 10;
                case 'L': return 11;
                case 'M': return 12;
                case 'N': return 13;
                case 'O': return 14;
                case 'P': return 15;
                case 'Q': return 16;
                case 'R': return 17;
                case 'S': return 18;
                case 'T': return 19;
                case 'U': return 20;
                case 'V': return 21;
                case 'W': return 22;
                case 'X': return 23;
                case 'Y': return 24;
                case 'Z': return 25;
                default: return -1;
            }
        }
        return -1; // Nome inválido
    }

    // Adiciona um nome na posição correta, caso não esteja ocupada
    public void adiciona(String nome) {
        int indice = getIndice(nome);
        if (indice != -1 && !posicaoOcupada(indice)) {
            nomes[indice] = nome;
            total_nomes++;
        } else {
            System.out.println("Não foi possível adicionar: " + nome);
        }
    }

    // Verifica se a posição do vetor já está ocupada
    private boolean posicaoOcupada(int posicao) {
        return nomes[posicao] != null;
    }

    // Remove um nome do vetor, caso ele exista
    public void remove(String nome) {
        int indice = getIndice(nome);
        if (indice != -1 && posicaoOcupada(indice) && nomes[indice].equals(nome)) {
            nomes[indice] = null;
            total_nomes--;
        } else {
            System.out.println("Nome não encontrado para remoção: " + nome);
        }
    }

    // Verifica se o nome está armazenado
    public boolean contem(String nome) {
        int indice = getIndice(nome);
        return indice != -1 && posicaoOcupada(indice) && nomes[indice].equals(nome);
    }

    // Retorna o nome armazenado em uma posição específica
    public String getNome(int posicao) {
        if (posicao >= 0 && posicao < 26) {
            return nomes[posicao];
        }
        return null;
    }

    // Valida se o nome é válido (não nulo, não vazio e começa com uma letra do alfabeto)
    public boolean validaNome(String nome) {
        return nome != null && !nome.isEmpty() && Character.isLetter(nome.charAt(0));
    }

    // Retorna o total de nomes armazenados
    public int totalNomes() {
        return total_nomes;
    }

    // Exibe os nomes armazenados
    public void exibirNomes() {
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] != null) {
                System.out.println("Posição " + i + ": " + nomes[i]);
            }
        }
    }

    public static void main(String[] args) {
        MinhaSegundaED ed = new MinhaSegundaED();
        ed.adiciona("Ana");
        ed.adiciona("Bruno");
        ed.adiciona("Carlos");
        ed.adiciona("Ana");

        System.out.println("Total de nomes: " + ed.totalNomes());
        ed.exibirNomes();

        System.out.println("Contém 'Ana'?: " + ed.contem("Ana"));
        ed.remove("Ana");
        System.out.println("Contém 'Ana' após remoção?: " + ed.contem("Ana"));
    }
}


