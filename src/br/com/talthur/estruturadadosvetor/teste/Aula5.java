package br.com.talthur.estruturadadosvetor.teste;

import br.com.talthur.estruturadadosvetor.Vetor;

public class Aula5 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(3);
		vetor.adiciona("Tá funcionando");
		vetor.adiciona("É pra funcionar");
		vetor.adiciona("Tem que rolar");
		vetor.adiciona("É pra dar pau");
		
		System.out.println(vetor.tamanho());
		System.out.println(vetor.toString());
		
		System.out.println(vetor.busca(1));
		System.out.println(vetor.busca(4));
		}
	
}
