package com.testwebapp.demo.repositories;

import com.testwebapp.demo.domain.Category;
import com.testwebapp.demo.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    Optional<Recipe> findByDescription(String description);

}
