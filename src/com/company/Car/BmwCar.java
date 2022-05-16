package com.company.Car;

public class BmwCar implements CreateAuto{
    @Override
    public void createRama() {
        System.out.println("Создаем раму для Бмв");
    }

    @Override
    public void createEngien() {
        System.out.println("Создаем двигатель для Бмв");
    }
}
