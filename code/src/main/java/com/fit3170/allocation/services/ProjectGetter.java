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
    public void extractJSON() throws JSONException{
            JSONObject obj = new JSONObject();
            JSONArray fields = obj.getJSONArray("field");

            String supervisorname = fields.getString(1);
            String title = fields.getString(2);
            int points = fields.getInt(3);
            String background = fields.getString(4);
            String aim = fields.getString(5);
            ArrayList<String> prereq = new ArrayList<>();
            JSONArray temp = fields.getJSONArray(6);
            for (int i = 0; i <= temp.length(); i++) {
                prereq.add(temp.getString(i));
            }
            ArrayList<String> coreq = new ArrayList<>();
            temp = fields.getJSONArray(7);
            for (int i = 0; i <= temp.length(); i++) {
                coreq.add(temp.getString(i));
            }
            ArrayList<String> categories = new ArrayList<>();
            temp = fields.getJSONArray(8);
            for (int i = 0; i <= temp.length(); i++) {
                categories.add(temp.getString(i));
            }
            String url = fields.getString(9);
            temp = fields.getJSONArray(10);
            UniversityLocation universityLocation = new UniversityLocation(temp.getString(1), temp.getString(2), temp.getString(3), temp.getInt(4));

        }
}



