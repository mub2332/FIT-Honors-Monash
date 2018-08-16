package com.fit3170.allocation.services;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class ProjectGetter {

    public static void main(String args[]){

    }

    public JSONObject mockJSON(){
        JSONObject json = new JSONObject();
        JSONArray array = new JSONArray();
        JSONObject item = new JSONObject();
        return json;
    }
    public JSONRespone extractJSON() throws JSONException{
            JSONObject obj = new JSONObject();

            String supervisorname = obj.getString("supervisorname");
            String title = obj.getString("title");
            int points = obj.getInt("creditPoints");
            String background = obj.getString("background");
            String aim = obj.getString("aims");
            ArrayList<String> prereq = new ArrayList<>();
            JSONArray temp = obj.getJSONArray("prereq");
            for (int i = 0; i <= temp.length(); i++) {
                prereq.add(temp.getString(i));
            }
            ArrayList<String> coreq = new ArrayList<>();
            temp = obj.getJSONArray("coreq");
            for (int i = 0; i <= temp.length(); i++) {
                coreq.add(temp.getString(i));
            }
            String url = obj.getString("URL");
            ArrayList<String> categories = new ArrayList<>();
            temp = obj.getJSONArray("category");
            for (int i = 0; i <= temp.length(); i++) {
                categories.add(temp.getString(i));
            }
            String campus = obj.getString("campus");
            String message = obj.getString("message");

            JSONRespone newResponse = new JSONRespone(supervisorname, title, points, background, aim, prereq, coreq, url, categories, campus, message);

            return newResponse;


        }
}



