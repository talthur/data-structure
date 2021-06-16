package br.com.talthur.estruturadadosvetor.base;

import java.util.Arrays;

public class EstruturaDadosBase<T> {

	
	private T[] elementos;
	private int tamanhoRealArray;

	public EstruturaDadosBase(int capacidadeVetor) {
		this.elementos =  (T[]) new Object[capacidadeVetor];
		this.tamanhoRealArray = 0;
	}
	
	public EstruturaDadosBase(){
		this(10);
	}
	
	public boolean estaVazia() {
		return this.tamanhoRealArray == 0;
	}
	
	private void aumentaCapacidade(){
		if (this.tamanhoRealArray == this.elementos.length){
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i=0; i<this.elementos.length; i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	protected boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanhoRealArray < this.elementos.length){
			this.elementos[this.tamanhoRealArray] = elemento;
			this.tamanhoRealArray++;
			return true;
		} 
		return false;
	}
	
	protected boolean adiciona(int posicao, T elemento){

		if (posicao < 0 || posicao > tamanhoRealArray){
			throw new IllegalArgumentException("Posição inválida");
		}

		this.aumentaCapacidade();
		
		for (int i=this.tamanhoRealArray-1; i>=posicao; i--){
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanhoRealArray++;

		return true;
	
	}
	
	protected void remove(int posicao){
		if (!(posicao >= 0 && posicao < tamanhoRealArray)){
			throw new IllegalArgumentException("Posicao inválida");
		}
		for (int i=posicao; i<tamanhoRealArray-1; i++){
			elementos[i] = elementos[i+1];
		}
		tamanhoRealArray--;
	}
	
	public int tamanho(){
		return this.tamanhoRealArray;
	}

	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i=0; i<this.tamanhoRealArray-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if (this.tamanhoRealArray>0){
			s.append(this.elementos[this.tamanhoRealArray-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
	
	
}
