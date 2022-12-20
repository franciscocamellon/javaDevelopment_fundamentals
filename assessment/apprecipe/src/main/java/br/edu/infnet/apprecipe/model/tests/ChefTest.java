package br.edu.infnet.apprecipe.model.tests;

import br.edu.infnet.apprecipe.model.domain.Chef;

public class ChefTest {

	public static void main(String[] args) {

		Chef c1 = new Chef("Joao", "Almeria", "joao.almeria@email.com" );
		System.out.println(c1);
		
		Chef c2 = new Chef("Joao", "Almeria", "joao.almeria@email.com" );
		System.out.println(c2);
		
		Chef c3 = new Chef("Joao", "Almeria", "joao.almeria@email.com" );
		System.out.println(c3);

	}

}
