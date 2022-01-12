package com.company;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AutoBase {

    private long id;
    private String autoParkName;
    private String driver;
    private String state;

    public AutoBase() {
    }

    public AutoBase(long id, String autoParkName, String driver, String state) {
        this.id = id;
        this.autoParkName = autoParkName;
        this.driver = driver;
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAutoParkName() {
        return autoParkName;
    }

    public void setAutoParkName(String autoParkName) {
        this.autoParkName = autoParkName;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static void autopark(AutoBase[] autoparks) {
        for (int i = 0; i < autoparks.length; i++) {
            System.out.println();
            System.out.print(autoparks[i].getId() + "|");
            System.out.printf("%18s", autoparks[i].getAutoParkName() + "|");
            System.out.printf("%12s", autoparks[i].getDriver() + "  |On");
            System.out.printf("%5s", autoparks[i].getState());
        }
    }

    public static void autoparkk() throws IOException {
        System.err.println("#  | Bus           | Driver  | State");
        System.err.println("--—+———---———------+———------+--------");
        String data1 = new String(Files.readAllBytes(Paths.get
                ("C:\\Users\\admin\\IdeaProjects\\MotorDepot1\\one.json")));
        JSONArray jsonArray = new JSONArray(data1);
        AutoBase[] autoparks = new AutoBase[jsonArray.length()];
        for (int i = 0; i < jsonArray.length(); i++) {
            autoparks[i] = new AutoBase();
            String st = jsonArray.get(i).toString();
            JSONObject object = new JSONObject(st);
            autoparks[i].setId(object.optInt("id"));
            autoparks[i].setAutoParkName((object.optString("name")));
            autoparks[i].setDriver(object.optString("driver"));
            autoparks[i].setState(String.valueOf(AutoEnum.BASE));
        }
        AutoBase.autopark(autoparks);
    }

    public static void info(AutoBase autoBase) {
        System.out.println("N" + autoBase.getId());
        System.out.println("Name" + autoBase.getAutoParkName());
        System.out.println("Draiver" + autoBase.getDriver());
        System.out.println("State" + autoBase.getState());
    }
}
//    public static void method(String action, AutoBase autoBase, Draiver[] draivers)  {
//        switch (action) {
//            case "1":
//                if (autoBase.getState() == AutoEnum.BASE) {
//                    AutoEnum autoEnum = AutoEnum.BASE;
//                    try {
//                        autoEnum.changeDriverBase(autoBase,draivers);
//                    } catch (Exception e) {
//                        System.out.println("U truckta netu voditelya");
//                    }
//                } else if (autoBase.getState() == AutoEnum.ROUTE) {
//                    AutoEnum route = AutoEnum.ROUTE;
//                    try {
//                        route.changeDriverBase(autoBase,draivers);
//                    } catch (Exception e) {
//                        System.out.println("Грузовик в пути, невозможно сменить водителя");
//                    }
//                } else {
//                    AutoEnum repair = AutoEnum.REPAIR;
//                    try {
//                        repair.changeDriverBase(autoBase,draivers);;
//                    } catch (Exception e) {
//                        System.out.println("Нельзя сменить водителя");
//                    }
//
//                }
//                break;
//            case "2" :
//                if (autoBase.getState() == AutoEnum.BASE) {
//                    AutoEnum autoEnum = AutoEnum.BASE;
//                    try {
//                        autoEnum.changeDriverRouteBase(Base(autoBase));
//                    } catch (Exception e) {
//                        System.out.println("Грузовикa netu voditelya");
//                    }
//                } else if (autoBase.getState() == AutoEnum.ROUTE) {
//                    AutoEnum autoEnum = AutoEnum.ROUTE;
//                    try {
//                        autoEnum.changeDriverRouteBase(autoBase);
//                    } catch (Exception e) {
//                    }
//                } else {
//                    AutoEnum autoEnum = AutoEnum.REPAIR;
//                    try {
//                        autoEnum.changeDriverRouteBase(autoBase);
//                    } catch (Exception e) {
//                        System.out.println();
//                    }
//                }
//                break;
//            case "3" :
//                if (autoBase.getState() == AutoEnum.BASE) {
//                    AutoEnum autoEnum = AutoEnum.BASE;
//                    try {
//                        autoEnum.changeDriverRepairBase(autoBase);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                } else if (autoBase.getState() == AutoEnum.ROUTE) {
//                    AutoEnum autoEnum = AutoEnum.ROUTE;
//                    try {
//                        autoEnum.changeDriverRepairBase(autoBase);
//                    } catch (Exception e) {
//                        System.out.println();
//                    }
//                } else {
//                    try {
//                        AutoEnum autoEnum = AutoEnum.REPAIR;
//                        autoEnum.changeDriverRepairBase(autoBase);
//                    } catch (Exception e) {
//                        System.out.println("uje v remonte");
//                    }
//                }
//                break;
//            default:
//                System.out.println();
//        }
   // }
//}

