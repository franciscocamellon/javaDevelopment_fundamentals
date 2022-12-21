package br.edu.infnet.apprecipe.model.tests;

import br.edu.infnet.apprecipe.model.domain.Chef;
import br.edu.infnet.apprecipe.model.exceptions.NullOrEmptyAttributeException;

public class ChefTest {

	public static void main(String[] args) {

		
		try {
			Chef c1 = new Chef("Joao", "Almeria", "joao.almeria@email.com" );
			System.out.println(c1);
		} catch (NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Chef c2 = new Chef(null, "Cantucci Osteria", "maria.cantucci@email.com" );
			System.out.println(c2);
		} catch (NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Chef c3 = new Chef("Manel", "Quanto Café", "" );
			System.out.println(c3);
		} catch (NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Chef c4 = new Chef("Francisco", "", "chico.bala@email.com" );
			System.out.println(c4);
		} catch (NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}
