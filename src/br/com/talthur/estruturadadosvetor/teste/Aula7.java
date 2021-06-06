package br.com.talthur.estruturadadosvetor.teste;

import br.com.talthur.estruturadadosvetor.Vetor;

public class Aula7 {
	
	public static void main(String[] args) {
		Vetor vetor = new Vetor(5);
		vetor.adiciona("3");
		vetor.adiciona("4");
		vetor.adiciona("5");
		vetor.adiciona("7");
		
		System.out.println(vetor.toString());
		
		vetor.adicionaQualquerLugar(0, "7");
		
		System.out.println(vetor.toString());
		
		vetor.remove(0);
		
		System.out.println(vetor.toString());
		}

}
