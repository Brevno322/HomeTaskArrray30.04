package com.company.shop;

import com.company.shop.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Service extends Add {


    public void Go() {
        Add ussser = new Add();
        User user = new User("dfdf", 213, 100);
        ussser.Registration();


        System.out.println("Добро пожаловать в наш магазин ");
        System.out.println("ВЫБЕРИТЕ КАТЕГОРИЮ" + "\n" +
                "1-мясо" + "\n" +
                "2-фрукты" + "\n" +
                "3-сладости" + "\n" +
                "4-крупы" + "\n");
        Scanner vibor = new Scanner(System.in);
        int vvibor = vibor.nextInt();
        ArrayList<Product> byBasket = new ArrayList<>();
        while (user.getMoney() > 0) {
            switch (vvibor) {
                case 1:
                    addMeat();
                    System.out.println(categoriesMeat);
                    Scanner vibor1 = new Scanner(System.in);
                    int vvibor1 = vibor1.nextInt();
                    switch (vvibor1) {
                        case 1:
                            if (user.getMoney() > meat1.getPrice()) {
                                byBasket.add(meat1);
                                user.setMoney(user.getMoney() - meat1.getPrice());
                            } else System.out.println("у вас нет денег");
                            break;
                        case 2:
                            if (user.getMoney() > meat2.getPrice()) {
                                byBasket.add(meat2);
                                user.setMoney(user.getMoney() - meat2.getPrice());
                            } else System.out.println("у вас нет денег");
                            break;
                        case 3:
                            if (user.getMoney() > meat3.getPrice()) {
                                byBasket.add(meat3);
                                user.setMoney(user.getMoney() - meat3.getPrice());
                            } else System.out.println("у вас нет денег");
                            break;
                        case 4:
                            byBasket.add(meat4);
                            break;
                    }


                case 2:
                    addFruits();
                    System.out.println(categoriesFruits);
                    break;
                case 3:
                    addSweetness();
                    System.out.println(categoriesSweetness);
                    break;
                case 4:
                    addGroats();
                    System.out.println(categoriesGroats);
                    break;
            }

            System.out.println("вы купили" + byBasket + user.getMoney());
        }

    }

}


