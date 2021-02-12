package com.example.foroom;
import android.content.Context;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Categories {

    private List data;

   private static Categories single_instance = null;

    public Categories( List<Category> data){

        this.data = data;
    }

    static Categories getInstance() {
        if (single_instance == null) {

         //   single_instance = new Categories(this.data);
        }

        return single_instance;
    }






}
