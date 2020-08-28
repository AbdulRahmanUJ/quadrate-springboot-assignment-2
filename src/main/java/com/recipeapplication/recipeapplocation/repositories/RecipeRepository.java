package com.recipeapplication.recipeapplocation.repositories;

import com.recipeapplication.recipeapplocation.models.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository <Recipe, Integer>{
}
