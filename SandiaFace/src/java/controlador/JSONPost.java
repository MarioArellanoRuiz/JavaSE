/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import com.google.gson.*;
import java.io.BufferedReader;

/**
 *
 * @author fjcorona
 */
public class JSONPost {
    
    public static JsonObject getJsonObject(BufferedReader reqReader) {
        StringBuilder jb = new StringBuilder();
        String line = null;
        
        try {
            BufferedReader reader = reqReader;
            while ((line = reader.readLine()) != null) {
                jb.append(line);
            }
        } catch (Exception e) {
        }
        
        String jsonString = jb.toString();

        
        JsonObject jsonObject = new Gson().fromJson(jsonString, JsonObject.class);
        return jsonObject;
    }
    
}
