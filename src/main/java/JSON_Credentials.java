package com.daw;

import org.json.simple.JSONObject;

import java.util.Arrays;
import java.util.List;

public class JSON_Credentials {

    static public List<String> standard_user() {

        for (int i = 0; i < JSON_Extractor.credentials().size(); i++) {
            JSONObject credential = (JSONObject) JSON_Extractor.credentials().get(i);
            JSONObject set = (JSONObject) credential.get("set");

            if (set.get("settingname").toString().equals("standard_user")) {
                List<String> standard_user = Arrays.asList(set.get("username").toString(), set.get("password").toString());
                return standard_user;
            }
        }
        return null;
    }

    static public List<String> problem_user() {

        for (int i = 0; i < JSON_Extractor.credentials().size(); i++) {
            JSONObject credential = (JSONObject) JSON_Extractor.credentials().get(i);
            JSONObject set = (JSONObject) credential.get("set");

            if (set.get("settingname").toString().equals("problem_user")) {
                List<String> problem_user = Arrays.asList(set.get("username").toString(), set.get("password").toString());
                return problem_user;
            }
        }
        return null;
    }
}
