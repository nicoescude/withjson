package com.nescude.withjson;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONPointer;
import org.json.JSONStringer;
import org.json.JSONTokener;

public class JFileReader {
    
    public static JSONObject readJSON(String filename){
        JSONObject jsonObject = new JSONObject();
        String s = readDefault(filename);
        
        if (!s.equals("")){
            
            jsonObject = new JSONObject(s);
            return jsonObject;
        }
        return null;
    }

    public static JSONArray readJSONArray(String filename){
        JSONArray jsonArray = new JSONArray();
        String s = readDefault(filename);
        
        if (!s.equals("")){
            
            jsonArray = new JSONArray(s);
            return jsonArray;
        }
        return null;
    }

    private static String readDefault(String filename){
        String s = "";
        try {
            Scanner fs = new Scanner(new File(filename));

            while (fs.hasNextLine()){
                s += fs.nextLine();
            }
            fs.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error, Archivo no encontrado!");
        }
        return s;
    }    
}