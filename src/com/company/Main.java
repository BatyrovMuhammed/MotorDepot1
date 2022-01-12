package com.company;

import java.io.IOException;
import java.lang.reflect.AnnotatedType;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        AutoBase.autoparkk();
        System.out.println(" " );
        System.out.println(" " );
        Draiver.autoparkk2();
        System.out.println("  ");
        System.out.println("  ");
        System.out.println();
      //   AutoBase4.autoparkc333();

//        Scanner scanner = new Scanner(System.in);
//        String data = new String(Files.readAllBytes(Paths.get("info.json")));
//        JSONArray jsonArray = new JSONArray(data);
//        Auto[] autos = new Auto[jsonArray.length()];
//        for (int i = 0; i < jsonArray.length(); i++) {
//            autos[i] = new Auto();
//            String str = jsonArray.get(i).toString();
//            JSONObject object = new JSONObject(str);
//            autos[i].setId(object.getInt("id"));
//            autos[i].setAutoName(object.getString("name"));
//            autos[i].setDriver(object.getString("driver"));
//            autos[i].setState(State.BASE);
//        }
//
//        String driverData = new String(Files.readAllBytes(Paths.get("infoOfDrivers.json")));
//        JSONArray json = new JSONArray(driverData);
//        Driver[] drivers = new Driver[json.length()];
//        for (int i = 0; i < drivers.length; i++) {
//            drivers[i] = new Driver();
//            String str = json.get(i).toString();
//            JSONObject object = new JSONObject(str);
//            drivers[i].setId(object.getInt("id"));
//            drivers[i].setName(object.getString("name"));
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        print(autos);
//        while (true) {
//            System.out.println("choose one of the truck");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            AutoBase autoBase = new AutoBase();
//            AutoBase.info(autoBase.[choice - 1]);
//           Draiver.autoparkk2();
//            String action = scanner.nextLine();
//            AutoBase.action(action, autos[choice - 1], drivers);
//            print(autos);
//            print(drivers);
//        }
//    }
//    }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("``````````````````````````````````````````````");
//        while (true) {
//            System.out.println("Bir mashina tandanyz");
//            int input = scanner.nextInt();
//            scanner.nextInt();
//            AutoBase autoBase = new AutoBase();
//
           // Draiver.info([input - 1]);
//            ServiceImpl service = new ServiceImpl();
//            getInstruction();
//            String action = scanner.nextLine();
//            if (action.equals("1")) {
//                service.changeDriver(cars[input - 1], drivers[input - 1]);
//            } else if (action.equals("2")) {
//                service.startDriving(cars[input - 1], drivers[input - 1]);
//            } else if (action.equals("3")) {
//                service.startRepair(cars[input - 1], drivers[input - 1]);
//            }


//    public static void print(AutoBase[] autoBase) {
//        System.out.println("`````````` AutoBase `````````````");
//        System.out.println("#  | Bus           | Driver  | State");
//        System.out.println("--—+———---———------+———------+--------");
//        for (int i = 0; i < autoBase.length; i++) {
//            System.out.println(autoBase[i]);
//        }
//    }
//
//    public static void print(Draiver[] draivers) {
//        System.out.println("`````````` Draivers `````````````");
//        System.out.println("#  | Bus           | Driver  | State");
//        System.out.println("--—+———---———------+———------+--------");
//        for (int i = 0; i < draivers.length; i++) {
//            System.out.println(draivers[i]);
//        }
//    }
//    public static void print2(){
//        System.out.println(" Press to 1 to change draiver ");
//        System.out.println(" Press to 2 to start driving ");
//        System.out.println(" Press to 3 to start repair ");
    }
}