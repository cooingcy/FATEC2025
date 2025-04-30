public class HashLinear {
	private Hash[] tab; // Vetor de posições da tabela hash
	private int TAM_MAX; // Tamanho máximo da tabela

	public HashLinear(int tam) {
		tab = new Hash[tam];
		TAM_MAX = tam;
		for (int i = 0; i < tam; i++)
			tab[i] = new Hash(); // Inicializa todas as posições como vazias
	}

	private int funcaohash(double chave) {
		int v = (int) chave;
		return (Math.abs(v) % TAM_MAX); // Função hash básica usando módulo
	}

	public void insere(double item) {
		if (cheia()) { // Verifica se a tabela está cheia
			System.out.println("\n-> ATENÇÃO: Tabela cheia");
			return;
		}

		int pos = funcaohash(item);

		while (tab[pos].estado == 1) { // Trata colisões via sondagem linear
			if (tab[pos].item == item) { // Evita inserir itens duplicados
				System.out.println("\n-> ATENÇÃO: Este item já foi cadastrado");
				return;
			}
			pos = (pos + 1) % TAM_MAX; // Próxima posição
		}

		tab[pos].item = item;
		tab[pos].estado = 1; // Marca a posição como ocupada
		System.out.print("-> Inserido HASH[" + pos + "]");
	}

	public int busca(double chave) {
		int pos = funcaohash(chave);
		int inicial = pos;

		while (tab[pos].estado != 0) { // Continua até encontrar posição livre
			if (tab[pos].estado == 1 && tab[pos].item == chave)
				return pos; // Item encontrado
			pos = (pos + 1) % TAM_MAX;
			if (pos == inicial)
				break; // Voltou ao início sem encontrar
		}

		return -1; // Item não encontrado
	}

	public void apaga(double chave) {
		int pos = busca(chave);
		if (pos != -1) {
			tab[pos].estado = 2; // Marca posição como removida
			System.out.print("-> Dado HASH[" + pos + "] apagado");
		} else {
			System.out.print("Item não encontrado");
		}
	}

	public void imprime() {
		for (int i = 0; i < TAM_MAX; i++) {
			if (tab[i].estado == 1)
				System.out.print("\nHash[" + i + "] = " + tab[i].item); // Imprime apenas itens ocupados
		}
	}

	public boolean cheia() {
		int qtde = 0;
		for (int i = 0; i < TAM_MAX; i++) {
			if (tab[i].estado == 1) { // Conta apenas posições ocupadas
				qtde++;
			}
		}
		return qtde == TAM_MAX;
	}
}
