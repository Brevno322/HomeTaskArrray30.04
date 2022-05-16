package com.company.Car;

public class FactoryMercedes  implements CreateAuto{

    @Override
    public void createRama() {
        System.out.println("Создаем раму для мерседеса");
    }

    @Override
    public void createEngien() {
        System.out.println("Создаем двигатель для мерседеса");
    }
}
