package com.company.Car;

public class FactoryBmw implements CreateAuto{
    @Override
    public void createRama() {
        System.out.println("Создаем раму для Бмв");
    }

    @Override
    public void createEngien() {
        System.out.println("Создаем двигатель для Бмв");
    }
}
