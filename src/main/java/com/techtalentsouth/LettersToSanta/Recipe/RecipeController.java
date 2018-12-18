package com.techtalentsouth.LettersToSanta.Recipe;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RecipeController {
	
	@Autowired
	private RecipeRepository recipeRepository;
	
	//main recipe page
	@GetMapping("/recipes")
	public ModelAndView recipeList() {
		ModelAndView mv = new ModelAndView("recipes/index");
		mv.addObject("recipes", recipeRepository.findAll());
		return mv;
	}

	//shows the form for creating a new recipe
	@GetMapping("/recipes/add")
	public ModelAndView newRecipe(Recipe recipe) {
		ModelAndView mv = new ModelAndView("recipes/new");
		return mv;
	}

	//handles the saving of the recipe and shows the recipe after creation
	@PostMapping("/recipes/create")
	public ModelAndView createRecipe(Recipe recipe) {
		ModelAndView mv = new ModelAndView("recipes/recipe");
		Recipe receipt = recipeRepository.save(recipe);
		mv.addObject("recipe", receipt);
		return mv;
	}

	//shows the form for editing a recipe
	@GetMapping("/recipes/edit/{id}")
	public ModelAndView updateRecipeForm(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView("recipes/edit");
		Optional<Recipe> recipe = recipeRepository.findById(id);
		mv.addObject("recipe", recipe);
		return mv;
	}

	//saves the edits to the recipe
	@PutMapping("/recipes/update")
	public ModelAndView updateRecipe(Recipe recipe) {
		ModelAndView mv = new ModelAndView("recipes/recipe");
		recipeRepository.save(recipe);
		return mv;
	}

	//deletes recipe
	@DeleteMapping("/recipes/delete/{id}")
	public ModelAndView deleteLetter(@PathVariable("id") Long id) {
		ModelAndView mv = new ModelAndView("redirect:/recipes");
		recipeRepository.deleteById(id);
		return mv;
	}
}
