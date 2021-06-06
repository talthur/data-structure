package br.com.talthur.estruturadadosvetor;

public class VetorObjetos {

	private Object[] elementos;
	private int tamanhoRealArray;

	public VetorObjetos(int capacidadeVetor) {
		this.elementos = new Object[capacidadeVetor];
		this.tamanhoRealArray = 0;
	}

	public void aumentaCapacidade() {

		Object[] arrayAumentado;

		if (this.elementos.length == this.tamanhoRealArray) {
			arrayAumentado = new Object[tamanhoRealArray * 2];
			for (int i = 0; i < tamanhoRealArray; i++) {
				arrayAumentado[i] = elementos[i];
			}
			this.elementos = arrayAumentado;
		}
	}

	public void adicionaQualquerLugar(int index, Object elemento) {

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

	public boolean adiciona(Object elemento) {

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

	public Object busca(int index) {

		if (!(index >= 0 && index < tamanhoRealArray)) {
			throw new IllegalArgumentException("Index não existe");
		}

		return elementos[index];
	}

	public int busca(Object elementoBusca) {

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
			Object pos = this.elementos[i+ 1];
			this.elementos[i] = pos;
		}
		
		tamanhoRealArray --;

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
