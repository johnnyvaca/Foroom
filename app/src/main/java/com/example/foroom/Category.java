package com.example.foroom;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Category {
    private Integer id;
    private String name;

    public Category() {

    }


    public String getName() {
        return this.name;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory(Context context) throws JSONException {
        DataProvider dataProvider = DataProvider.getInstance();
        String json = dataProvider.getJsonFromAssets(context, "categories.json");
        Category category = new Category();
        List<Category> list = new ArrayList<Category>();


        JSONObject vide = new JSONObject(json);
        JSONArray data = vide.getJSONArray("data");
        for (int i = 0; i < data.length(); i++) {
            JSONObject oneRaw = data.getJSONObject(i);
            Integer id = oneRaw.getInt("id");
            String name = oneRaw.getString("name");
            category.setId(id);
            category.setName(name);
            list.add(category);
        }




        return category;
    }




}
