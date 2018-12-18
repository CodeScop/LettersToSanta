package com.techtalentsouth.LettersToSanta.Recipe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String ingredients;
	private String instructions;

	public Recipe() {
		// TODO Auto-generated constructor stub
	}

	public Recipe(String title, String ingredients, String instructions) {
		this.title = title;
		this.ingredients = ingredients;
		this.instructions = instructions;
	}

	@Override
	public String toString() {
		return "Recipe [title=" + title + ", ingredients=" + ingredients + ", instructions=" + instructions + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	
}
