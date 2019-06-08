package com.testwebapp.demo.services;

import com.testwebapp.demo.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
