package com.fissst;

import com.fissst.JSON_Extractor;
import org.json.simple.JSONObject;

import java.util.Arrays;
import java.util.List;

public class JSON_Links {

    static public List<String> MainPage() {

        for (int i = 0; i < JSON_Extractor.links().size(); i++) {
            JSONObject credential = (JSONObject) JSON_Extractor.links().get(i);
            JSONObject address = (JSONObject) credential.get("address");

            if (address.get("linkname").toString().equals("MainPage")) {
                List<String> main_page = Arrays.asList(address.get("URL").toString());
                return main_page;
            }
        }
        return null;
    }

}
