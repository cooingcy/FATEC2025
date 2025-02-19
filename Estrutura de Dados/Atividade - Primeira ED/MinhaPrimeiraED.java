package com.mycompany.minhaprimeiraed;

public class MinhaPrimeiraED {

    // Vetor de objetos que armazena os elementos
    private Object[] objetos = new Object[10];
    public int totalDeObjetos = 0;

    // Método para adicionar um objeto em uma posição específica
    public void adiciona(int posicao, Object objeto) {
        // Verifica se a posição é válida ou se a posição é o final da lista
        if (!posicaoValida(posicao) && posicao != totalDeObjetos) {
            throw new IllegalArgumentException("Posição inválida");
        }
        // Se o vetor estiver cheio, expande o tamanho do vetor
        if (vetorCheio()) {
            expandirVetor();
        }
        // Move os elementos da lista para a direita para abrir espaço na posição desejada
        for (int i = totalDeObjetos; i > posicao; i--) {
            objetos[i] = objetos[i - 1];
        }
        // Adiciona o objeto na posição correta
        objetos[posicao] = objeto;
        totalDeObjetos++; // Atualiza o contador de objetos
        System.out.println("Objeto adicionado na posição: " + posicao);
    }

    // Método para adicionar um objeto ao final da lista
    public void adiciona(Object objeto) {
        // Verifica se o vetor está cheio e, se necessário, o expande
        if (vetorCheio()) {
            expandirVetor();
        }
        // Adiciona o objeto na próxima posição disponível
        objetos[totalDeObjetos] = objeto;
        totalDeObjetos++; // Atualiza o contador de objetos
        System.out.println("Objeto adicionado no final na posição: " + (totalDeObjetos - 1));
    }

    // Método para verificar se a posição especificada está ocupada
    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeObjetos;
    }

    // Método para verificar se a posição é válida para inserção ou remoção
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= totalDeObjetos;
    }

    // Método para remover um objeto de uma posição específica
    public void remove(int posicao) {
        // Verifica se a posição está ocupada
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        // Armazena o objeto removido para exibir
        Object removido = objetos[posicao];
        // Move os elementos para a esquerda para preencher a posição do objeto removido
        for (int i = posicao; i < totalDeObjetos - 1; i++) {
            objetos[i] = objetos[i + 1];
        }
        // Remove a referência do último elemento
        objetos[totalDeObjetos - 1] = null;
        totalDeObjetos--; // Atualiza o contador de objetos.
        System.out.println("Objeto removido da posição: " + posicao + ", valor: " + removido);
    }

    // Método para verificar se um objeto está no vetor
    public boolean contem(Object objeto) {
        // Percorre o vetor procurando pelo objeto
        for (int i = 0; i < totalDeObjetos; i++) {
            if (objetos[i].equals(objeto)) {
                System.out.println("Objeto encontrado na posição: " + i);
                return true;
            }
        }
        System.out.println("Objeto não encontrado.");
        return false;
    }

    // Método para obter um objeto a partir de uma posição específica
    public Object getObjeto(int posicao) {
        // Verifica se a posição é válida
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        // Exibe o objeto encontrado na posição especificada
        System.out.println("Objeto na posição " + posicao + " é " + objetos[posicao]);
        return objetos[posicao];
    }

    // Método para retornar o número total de objetos no vetor
    public int tamanho() {
        System.out.println("O tamanho atual da lista é: " + totalDeObjetos);
        return totalDeObjetos;
    }

    // Método para verificar se o vetor está cheio
    private boolean vetorCheio() {
        return totalDeObjetos == objetos.length;
    }

    // Método para expandir o vetor, dobrando seu tamanho
    private void expandirVetor() {
        // Cria um novo vetor com o dobro do tamanho
        Object[] novoVetor = new Object[objetos.length * 2];
        // Copia os elementos do vetor original para o novo vetor
        for (int i = 0; i < objetos.length; i++) {
            novoVetor[i] = objetos[i];
        }
        objetos = novoVetor; // Substitui o vetor original pelo expandido
    }

    // Método principal para testar os métodos implementados
    public static void main(String[] args) {
        MinhaPrimeiraED lista = new MinhaPrimeiraED();

        // Adiciona três objetos
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        // Obtém o objeto na posição 1
        lista.getObjeto(1);

        // Verifica se "B" e "D" estão na lista
        lista.contem("B");
        lista.contem("D");

        // Remove o objeto na posição 1
        lista.remove(1);

        // Exibe o tamanho da lista após a remoção
        lista.tamanho();
    }
}
