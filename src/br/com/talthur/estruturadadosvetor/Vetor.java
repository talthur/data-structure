package br.com.talthur.estruturadadosvetor;

public class Vetor {

	private String[] elementos;
	private int tamanhoRealArray;

	public Vetor(int capacidadeVetor) {
		this.elementos = new String[capacidadeVetor];
		this.tamanhoRealArray = 0;
	}

	public boolean aumentaCapacidade() {

		String[] arrayAumentado;

		if (this.elementos.length == this.tamanhoRealArray) {
			arrayAumentado = new String[tamanhoRealArray * 2];
			for (int i = 0; i < tamanhoRealArray; i++) {
				arrayAumentado[i] = elementos[i];
			}

			this.elementos = arrayAumentado;
		}

		return true;

	}

	public boolean adicionQualquerLugar(int index, String elemento) {

		
		if(index < 0 || index > this.tamanhoRealArray) {
			throw new IllegalArgumentException("Index não existe");

		}
		this.aumentaCapacidade();

			for (int i = tamanhoRealArray - 1; i >= index; i--) {
				String ant = elementos[i];
				elementos[i + 1] = ant;

			}
			elementos[index] = elemento;
			this.tamanhoRealArray++;
			return true;

	}

	public boolean adiciona(String elemento) {

		if (this.tamanhoRealArray < this.elementos.length) {
			this.elementos[this.tamanhoRealArray] = elemento;
			this.tamanhoRealArray++;
			return true;
		}
		return false;
	}

	public int tamanho() {
		return this.tamanhoRealArray;
	}

	public String busca(int index) {

		if (!(index >= 0 && index < tamanhoRealArray)) {
			throw new IllegalArgumentException("Index não existe");
		}

		return elementos[index];
	}

	public int busca(String elementoBusca) {

		for (int i = 0; i < this.tamanhoRealArray; i++) {
			if (elementoBusca.equals(elementos[i])) {
				return i;
			}
		}

		return -1;

	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanhoRealArray - 1; i++) {

			s.append(elementos[i]);
			s.append(", ");
		}

		if (tamanhoRealArray > 0) {
			s.append(elementos[this.tamanhoRealArray - 1]);
		}

		s.append("]");
		return s.toString();
	}

}
