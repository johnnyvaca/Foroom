package com.example.foroom;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

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


    public List<Category> getCategories(Context context) throws JSONException {
        DataProvider dataProvider = DataProvider.getInstance();
        String json = dataProvider.getJsonFromAssets(context, "categories.json");
        List<Category> categories = new ArrayList<Category>();


        JSONObject jsonObject = new JSONObject(json);
        JSONArray data = jsonObject.getJSONArray("data");
        for (int i = 0; i < data.length(); i++) {
            JSONObject oneRaw = data.getJSONObject(i);
            Integer id = oneRaw.getInt("id");
            String name = oneRaw.getString("name");

            categories.add(new Category(id,name));
        }
        return categories;
    }


    public String getJsonFromAssets(Context context, String fileName) {

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
