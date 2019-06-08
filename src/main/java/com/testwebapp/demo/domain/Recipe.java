package com.testwebapp.demo.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
    @Data
    @EqualsAndHashCode(exclude = {"categories"})
    @Entity
        public class Recipe {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String description;
        private int cookTime;
        private String url;
        private String source;
        @Lob
        private String directions;

        @OneToOne(cascade = CascadeType.ALL)
        private Notes notes;

        @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
        private Set<Ingredient> ingredients = new HashSet<>();

        @ManyToMany
        @JoinTable(name = "recipe_category", joinColumns = @JoinColumn(name = "recipe_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
        private Set<Category> categories = new HashSet<>();

        @Lob
        private Byte[] image;

        @Enumerated(value = EnumType.STRING)
        private Difficulty difficulty;

        public void setNotes(Notes notes) {
            this.notes = notes;
        }

        public Set<Ingredient> getIngredients() {
            return ingredients;
        }



    }
