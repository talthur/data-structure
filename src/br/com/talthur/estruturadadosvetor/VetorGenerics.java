package br.com.talthur.estruturadadosvetor;

public class VetorGenerics<T> {

	private T[] elementos;
	private int tamanhoRealArray;

	public VetorGenerics(int capacidadeVetor) {
		this.elementos =  (T[]) new Object[capacidadeVetor];
		this.tamanhoRealArray = 0;
	}

	public void aumentaCapacidade() {

		T[] arrayAumentado;

		if (this.elementos.length == this.tamanhoRealArray) {
			arrayAumentado = (T[]) new Object[tamanhoRealArray * 2];
			for (int i = 0; i < tamanhoRealArray; i++) {
				arrayAumentado[i] = elementos[i];
			}
			this.elementos = arrayAumentado;
		}
	}

	public void adicionaQualquerLugar(int index, T elemento) {

		if (index < 0 || index > this.tamanhoRealArray) {
			throw new IllegalArgumentException("Index não existe");
		}
		
		this.aumentaCapacidade();

		for (int i = this.tamanhoRealArray - 1; i >= index; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[index] = elemento;
		this.tamanhoRealArray++;

	}

	public boolean adiciona(T elemento) {

		this.aumentaCapacidade();
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

	public T busca(int index) {

		if (!(index >= 0 && index < tamanhoRealArray)) {
			throw new IllegalArgumentException("Index não existe");
		}

		return elementos[index];
	}

	public int busca(T elementoBusca) {

		for (int i = 0; i < this.tamanhoRealArray; i++) {
			if (elementoBusca.equals(elementos[i])) {
				return i;
			}
		}

		return -1;

	}

	public void remove(int elementoRemove) {

		if (!(elementoRemove >= 0 && elementoRemove < tamanhoRealArray)) {
			throw new IllegalArgumentException("Index não existe");
		}

		for (int i = elementoRemove; i < this.tamanhoRealArray - 1; i++) {
			T pos = this.elementos[i+ 1];
			this.elementos[i] = pos;
		}
		
		tamanhoRealArray --;

	}
	
	public boolean contains(T elemento) {
		return this.busca(elemento) > 0;
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
