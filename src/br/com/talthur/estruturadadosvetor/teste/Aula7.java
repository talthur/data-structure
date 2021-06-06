package br.com.talthur.estruturadadosvetor.teste;

import br.com.talthur.estruturadadosvetor.Vetor;

public class Aula7 {
	
	public static void main(String[] args) {
		Vetor vetor = new Vetor(5);
		vetor.adiciona("2");
		vetor.adiciona("4");
		vetor.adiciona("5");
		vetor.adiciona("7");
		vetor.adicionQualquerLugar(2, "10");
		
		vetor.adicionQualquerLugar(0, "2");
		
		vetor.adicionQualquerLugar(10, "2");
		System.out.println(vetor.toString());
		}

}
