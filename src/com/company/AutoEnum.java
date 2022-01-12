package com.company;

import java.util.Random;

public enum AutoEnum implements Medhods {

    BASE("base") {
        @Override
        public void changeDriverBase(AutoBase autopark, Draiver[]autoparkc) {
            int num=0;
            for (int i = 0; i < autoparkc.length; i++) {
                if (autoparkc[i].getBus()!=null){
                    num++;
                }
            }
            autopark.setDriver(autoparkc[num].getName());
            autoparkc[num].setBus(autopark.getAutoParkName());
        }
        @Override
        public void changeDriverRouteBase(AutoBase autopark) throws Exception {
            if (autopark.getDriver().equals("")){
                throw  new Exception();
            }else {
                autopark.setState(String.valueOf(AutoEnum.ROUTE));
                System.out.println("успешно вышли на маршрут");
            }
        }
        @Override
        public void changeDriverRepairBase(AutoBase autopark) {
            autopark.setState(String.valueOf(AutoEnum.REPAIR));
            System.out.println("repait");
        }
    },
    ROUTE("route") {

        @Override
        public void changeDriverBase(AutoBase autopark, Draiver[]autoparkc) throws Exception {
            throw new Exception("Грузовик в пути, невозможно сменить водителя");
        }
        @Override
        public void changeDriverRouteBase(AutoBase autopark) throws Exception {
            throw new Exception();
        }
        @Override
        public void changeDriverRepairBase(AutoBase autopark) {
            autopark.setState(String.valueOf(AutoEnum.REPAIR));
            System.out.println("repair");
        }
    },
    REPAIR ("repair"){
        @Override
        public void changeDriverBase(AutoBase autopark, Draiver[]autoparkc) throws Exception {
            throw new Exception();
        }
        @Override
        public void changeDriverRouteBase(AutoBase autopark)  {
            Random random=new Random();
            int sanRandom=random.nextInt(2);
            if (sanRandom==0){
                autopark.setState(String.valueOf(AutoEnum.ROUTE));
                System.out.println();
            }
        }
        @Override
        public void changeDriverRepairBase(AutoBase autopark) throws Exception {
            throw new Exception();
        }
    };
    AutoEnum(String base) {
    }
}

