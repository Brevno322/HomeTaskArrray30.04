package com.company.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Add {
    //категоря мясо
    Product meat1 = new Product(10, 2, "Beef");
    Product meat2 = new Product(5, 5, "Chicken");
    Product meat3 = new Product(7, 3, "Pork");
    Product meat4 = new Product(20, 5, "Ground Meat");
    ArrayList<Product> meat = new ArrayList<>();

    public void addMeat() {
        meat.add(meat1);
        meat.add(meat2);
        meat.add(meat3);
        meat.add(meat4);
    }


    Categories categoriesMeat = new Categories("мясо", meat);
    //категоря фрукты
    Product fruits1 = new Product(10, 2, "Banana");
    Product fruits2 = new Product(5, 5, "Watermelon");
    Product fruits3 = new Product(7, 3, "Plum");
    Product fruits4 = new Product(20, 5, "Pear");
    ArrayList<Product> fruits = new ArrayList<>();

    public void addFruits() {
        fruits.add(fruits1);
        fruits.add(fruits2);
        fruits.add(fruits3);
        fruits.add(fruits4);
    }

    Categories categoriesFruits = new Categories("Фрукты", fruits);
    //категория сладости
    Product sweetness1=new Product(3,4,"Candies");
    Product sweetness2=new Product(2,5,"chocolate");
    Product sweetness3=new Product(4,2,"cake");
    Product sweetness4=new Product(5,1,"gum");
    ArrayList<Product>sweetness=new ArrayList<>();
    public void addSweetness(){
        sweetness.add(sweetness1);
        sweetness.add(sweetness2);
        sweetness.add(sweetness3);
        sweetness.add(sweetness4);

    }
    Categories categoriesSweetness=new Categories("Сладости",sweetness);
    //категория крупы
    Product groats1=new Product(3,5,"rice");
    Product groats2=new Product(6,1,"гречка");
    Product groats3=new Product(8,2,"манка");
    Product groats4=new Product(2,4,"овсянка");
    ArrayList<Product>groats=new ArrayList<>();
    public void addGroats(){
        groats.add(groats1);
        groats.add(groats2);
        groats.add(groats3);
        groats.add(groats4);
    }
    Categories categoriesGroats=new Categories("крупы",groats);
//создаем пользователя
public void Registration(){
    User user=new User("Busnes ",123,100);
    System.out.println("Придумайте логин ");
    Scanner login=new Scanner(System.in);
    String createLogin=login.next();
    user.setLogin(createLogin);
    System.out.println("ваш логин "+user.getLogin());
    System.out.println("придумайте пароль");
    Scanner password=new Scanner(System.in);
    int creatPassword=password.nextInt();
    user.setPassword(creatPassword);
    System.out.println("ваш пороль"+creatPassword);
    System.out.println("учетная запись создана ");
}


}
