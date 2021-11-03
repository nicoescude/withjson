package com.nescude.withjson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONWriter;

public class JFileWriter {

    public static void writeJSON(JSONObject object, String filename){
        String s = object.toString();
        try {
            File f = new File(filename);
            FileWriter fw = new FileWriter(f);

            fw.write(s);
            fw.flush();
            fw.close();

            System.out.println("Archivo json escrito con exito!");
        } catch (IOException e) {
            System.out.println("Error de E/S: "+e.getMessage());
        }
    }

    public static void writeJSONArray(JSONArray array, String filename){
        String s = array.toString();
        try {
            File f = new File(filename);
            FileWriter fw = new FileWriter(f);

            fw.write(s);
            fw.flush();
            fw.close();

            System.out.println("Archivo json escrito con exito!");
        } catch (IOException e) {
            System.out.println("Error de E/S: "+e.getMessage());
        }
    }
}
