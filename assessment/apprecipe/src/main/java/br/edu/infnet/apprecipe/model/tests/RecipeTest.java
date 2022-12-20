package br.edu.infnet.apprecipe.model.tests;

import br.edu.infnet.apprecipe.model.domain.Chef;
import br.edu.infnet.apprecipe.model.domain.Recipe;

public class RecipeTest {

	public static void main(String[] args) {
		
		Chef c1 = new Chef("Joao", "Almeria", "joao.almeria@email.com" );
		
		Recipe r1 = new Recipe();
		r1.setName("Primeira receita");
		r1.setQuantity(3);
		r1.setChef(c1);
		//r1.setIngredients(ingredients);
		System.out.println(r1);
		
		Recipe r2 = new Recipe();
		r2.setName("Primeira receita");
		r2.setQuantity(4);
		r2.setChef(c1);
		//r2.setIngredients(ingredients);
		System.out.println(r2);
		
		Recipe r3 = new Recipe();
		r3.setName("Primeira receita");
		r3.setQuantity(1);
		r3.setChef(c1);
		//r3.setIngredients(ingredients);
		System.out.println(r3);
		
	}

}
