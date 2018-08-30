package com.fit3171.allocation.services;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class JSONExtractor {

    // Delete if no needed MUST
    public static void main(String args[]) throws Exception {
        JSONExtractor extractor = new JSONExtractor();
        extractor.extractJSON(extractor.mockJSON());
    }

    public JSONArray mockJSON() throws Exception {
        JSONArray jsonArray = new JSONArray();

        JSONObject content = new JSONObject();
        content.put("supervisorname", "Janzen Lim");
        content.put("title", "HOHOHOHOHO");
        content.put("points", 10);
        content.put("background", "YESSSSSSS");
        content.put("aims", "PLEASE\n");
        content.put("prereq", "POKEMON");
        JSONArray array = new JSONArray();
        array.put("POKEMON");
        array.put("CHAIRMENDAR");
        content.put("prereq", array);

        content.put("coreq", array);

        array = new JSONArray();
        array.put("Pika");
        array.put("FAAAA");
        content.put("categories", array);
        content.put("URL", "LOL");
        content.put("campus", "Clayton");
        content.put("fieldOfStudy", "Honours");
        content.put("message", "HI");
        System.out.println(content);
        jsonArray.put(content);
        return jsonArray;
    }

    public ArrayList<JSONRespone> extractJSON(JSONArray jsonArray) throws JSONException {

        ArrayList<JSONRespone> allRespone = new ArrayList<>();

        for (int i = 0; i <= jsonArray.length() - 1; i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            String supervisorname = obj.getString("supervisorname");
            String title = obj.getString("title");
            int points = obj.getInt("points");
            String background = obj.getString("background");
            String aim = obj.getString("aims");
            ArrayList<String> prereq = new ArrayList<>();
            JSONArray temp = obj.getJSONArray("prereq");
            for (int j = 0; j <= temp.length() - 1; j++) {
                prereq.add(temp.getString(j));
            }
            ArrayList<String> coreq = new ArrayList<>();
            temp = obj.getJSONArray("coreq");
            for (int j = 0; j <= temp.length() - 1; j++) {
                coreq.add(temp.getString(j));
            }
            String url = obj.getString("URL");
            ArrayList<String> categories = new ArrayList<>();
            temp = obj.getJSONArray("categories");
            for (int j = 0; j <= temp.length() - 1; j++) {
                categories.add(temp.getString(j));
            }
            String campus = obj.getString("campus");
            String message = obj.getString("message");
            String fieldOfStudy = obj.getString("fieldOfStudy");

            JSONRespone newResponse = new JSONRespone(supervisorname, title, points, background, aim, prereq, coreq, url, categories, campus, message, fieldOfStudy);
            allRespone.add(newResponse);

        }

        System.out.print(allRespone.toString());
        return allRespone;
    }




}
