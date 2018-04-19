package com.example.marmm.recipe.Utility;

import com.example.marmm.recipe.model.Recipe;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("")
    Call<Recipe> getRecipe();
//    Call<Recipe> getName(@Path("name") String name);


}
