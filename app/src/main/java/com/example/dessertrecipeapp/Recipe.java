package com.example.dessertrecipeapp;

public class Recipe {

    private String Title;
    private String Time;
    private String Servings;
    private String Description;
    private String Ingredients;
    private String Method;
    private int Thumbnail;

    public Recipe() {
    }

    public Recipe(String title, String time, String servings, String description, String ingredients, String method, int thumbnail) {
        Title = title;
        Time = time;
        Servings = servings;
        Description = description;
        Ingredients = ingredients;
        Method = method;
        Thumbnail = thumbnail;
    }

    public String getTitle() {
        return Title;
    }

    public String getTime() {
        return Time;
    }

    public String getServings() {
        return Servings;
    }

    public String getDescription() {
        return Description;
    }

    public String getIngredients() {
        return Ingredients;
    }

    public String getMethod() {
        return Method;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setTime(String time) {
        Time = time;
    }

    public void setServings(String servings) {
        Servings = servings;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setIngredients(String ingredients) {
        Ingredients = ingredients;
    }

    public void setMethod(String method) {
        Method = method;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
