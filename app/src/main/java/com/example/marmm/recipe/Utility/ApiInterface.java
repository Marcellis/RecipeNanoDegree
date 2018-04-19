package com.example.marmm.recipe.Utility;

import com.example.marmm.recipe.model.Recipe;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("baking.json")
    Call<ArrayList<Recipe>> getRecipe();
}
