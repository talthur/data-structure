package br.com.talthur.estruturadadosvetor.teste;

import br.com.talthur.estruturadadosvetor.VetorObjetos;

public class Aula8 {

	public static void main(String[] args) {

		VetorObjetos vo = new VetorObjetos(3);
		vo.adiciona(3);
		vo.adiciona(4);
		vo.adiciona(5);
		
		System.out.println("tamanho = "+vo.tamanho());
		System.out.println(vo);
	}

}
