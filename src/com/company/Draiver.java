package com.company;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Draiver {

    private String id;
    private String name;
    private String bus;

    public Draiver() {
    }

    public Draiver(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public static void autopark2(Draiver[] autoparks2) {
        for (int i = 0; i < autoparks2.length; i++) {
            System.out.println( );
            System.out.print(autoparks2[i].getId() + " |");
            System.out.printf("%5s", autoparks2[i].getName() + "       |");

        }
    }
    public static void autoparkk2() throws IOException {
        System.out.println("#   Driver          |  Bus");
        System.out.println("—+————————————+————————————+");
        String data2 = new String(Files.readAllBytes(Paths.get
                ("C:\\Users\\admin\\IdeaProjects\\MotorDepot1\\two.json")));
        JSONArray jsonArray2 = new JSONArray(data2);
        Draiver[] autoparks2 = new Draiver[jsonArray2.length()];

        for (int i = 0; i < jsonArray2.length(); i++) {
            autoparks2[i] = new Draiver();
            String st = jsonArray2.get(i).toString();
            JSONObject object = new JSONObject(st);
            autoparks2[i].setId(object.optString("id"));
            autoparks2[i].setName(object.optString("name"));
        }
        Draiver.autopark2(autoparks2);
    }


}
