package com.company.Car;

public class Factory {

    public static CreateAuto shop(String name){
        switch (name){
            case "BMW":
                return new FactoryBmw();
            case "MRC":
                return new FactoryMercedes();
        }
        return null;
    }
}
