package br.edu.infnet.apprecipe.model.exceptions;

public class RecipeWithoutIngredientsException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public RecipeWithoutIngredientsException(String message) {
		super(message);
	}

}
