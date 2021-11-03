package com.nescude.withjson;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.Scanner;

import org.json.*;

public class App 
{
    public static void main( String[] args )
    {
        final String PATH = "data.json";
        final String PATH2 = "data2.json";
        JSONArray ja = JFileReader.readJSONArray(PATH);
        JSONObject jo = new JSONObject();
        jo.put("Id", ja.length());
        jo.put("Fecha", new Date());
        ja.put(jo);

        JFileWriter.writeJSONArray(ja, PATH);
    }
}
