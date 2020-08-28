package com.recipeapplication.recipeapplocation.controllers;

import com.recipeapplication.recipeapplocation.models.Recipe;
import com.recipeapplication.recipeapplocation.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
    public class RecipeController {

    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @GetMapping("/addrecipe")
    public String showSignUpForm(Recipe recipe) {
        return "add";
    }

    @GetMapping("/")
    public String showUpdateForm(Model model) {
        model.addAttribute("recipes", recipeRepository.findAll());
        return "index";
    }

    @PostMapping("/save")
    public String saveRecipe(@ModelAttribute("recipe") Recipe recipe){
        recipeRepository.save(recipe);
        return "redirect:index";
    }
}
