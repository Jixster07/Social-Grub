package com.example.socialgrub;

import android.net.Uri;
import android.os.Parcelable;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.HashMap;

@Parcel
public class Recipe {

    ArrayList<Ingredient> ingredients;
    ArrayList<String> directions;
    ArrayList<Tag> tags;

    String recipeUrl;

    String recipeTitle;
    String recipeDescription;
    String tagOne;

    public Recipe () {


    }

    public Recipe(String recipeUrl, String recipeTitle, String recipeDescription) {

        this.recipeUrl = recipeUrl;
        this.recipeTitle = recipeTitle;
        this.recipeDescription = recipeDescription;
    }

    public Recipe(String recipeUrl, String recipeTitle) {

        this.recipeUrl = recipeUrl;
        this.recipeTitle = recipeTitle;
    }

    public Recipe(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }


    public Recipe(ArrayList<Ingredient> ingredients, ArrayList<String> directions) {

        this.ingredients = ingredients;
        this.directions = directions;
    }

    public Recipe(ArrayList<Ingredient> ingredients, ArrayList<String> directions,ArrayList<Tag> tags) {

        this.ingredients = ingredients;
        this.directions = directions;
        this.tags = tags;
    }

    public Recipe(String recipeUrl, String recipeTitle, String recipeDescription, String tagOne) {

        this.recipeUrl = recipeUrl;
        this.recipeTitle = recipeTitle;
        this.recipeDescription = recipeDescription;
        this.tagOne = tagOne;
    }


    public Recipe(ArrayList<Ingredient> ingredients, ArrayList<String> directions, ArrayList<Tag> tags, String recipeTitle, String recipeDescription, String recipeUrl) {

        this.ingredients = ingredients;
        this.directions = directions;
        this.tags = tags;
        this.recipeTitle = recipeTitle;
        this.recipeDescription = recipeDescription;
        this.recipeUrl = recipeUrl;
    }


    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<String> getDirections() {
        return directions;
    }

    public void setDirections(ArrayList<String> directions) {
        this.directions = directions;
    }


    public String getRecipeTitle() {
        return recipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }


    public String getRecipeDescription() {
        return recipeDescription;
    }

    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }

    public ArrayList<Tag> getRecipeTags()
    {
        return this.tags;
    }

    public String getOneTag(){ return this.tagOne; }

    public String getRecipeUrl() {
        return recipeUrl;
    }

    public void setRecipeUrl(String recipeUrl) {
        this.recipeUrl = recipeUrl;
    }
}