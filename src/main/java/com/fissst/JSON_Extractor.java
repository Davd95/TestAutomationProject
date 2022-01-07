package com.fissst;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JSON_Extractor {

    public static JSONArray credentials() {

        try {
            JSONParser parser = new JSONParser();

            JSONObject json = (JSONObject) parser.parse(
                    new FileReader("src/main/resources/java_import.json"));

            // Import Credentials from JSON file
            JSONArray credentials = (JSONArray) json.get("credentials");
            return credentials;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static JSONArray links() {

        try {
            JSONParser parser = new JSONParser();

            JSONObject json = (JSONObject) parser.parse(
                    new FileReader("src/main/resources/java_import.json"));

            // Import Links from JSON file
            JSONArray links = (JSONArray) json.get("links");
            return links;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
