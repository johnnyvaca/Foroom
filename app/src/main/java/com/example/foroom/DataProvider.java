package com.example.foroom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Icon;

import androidx.annotation.Nullable;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;


public class DataProvider {

    private String json;
    private Context context;

    private static DataProvider single_instance = null;

    private DataProvider() {

    }

    static DataProvider getInstance() {
        if (single_instance == null) {

            single_instance = new DataProvider();
        }

        return single_instance;
    }

    public Categories getObjectCategories(Context context) {


        String json = getJsonFromAssets(context, "categories.json");
        Gson gson = new Gson();

        Categories object = gson.fromJson(json, Categories.class);

        return object;
    }


    private String getJsonFromAssets(Context context, String fileName) {

        String json;
        try {
            InputStream is = context.getAssets().open(fileName);

            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return json;
    }

}
