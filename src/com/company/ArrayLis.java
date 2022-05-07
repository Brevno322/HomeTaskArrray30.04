package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class ArrayLis {
    public static void task() {
        // Заменить все числа > 100 на 99
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(32);
        list.add(123);
        list.add(567);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 100) {
                list.set(i, 99);
            }
        }


        System.out.println(list);
    }


    //Сложить два arrayLista
    public static void SummList() {
        ArrayList<String> first = new ArrayList<>();
        first.add("45");
        first.add("32");
        first.add("67");
        first.add("2");
        for (int i = 0; i < first.size(); i++) {
            if (first.get(i) == "2") {
                first.remove(i);

            }
            System.out.println(first.get(i));
        }


    }
    public static void Suum(){
        ArrayList<Integer>one=new ArrayList<>();
        ArrayList<Integer>one1=new ArrayList<>();
        one.add(3);
        one.add(4);
        one.add(35);
        one.add(33);
        one.add(32);
        ArrayList<Integer>two=new ArrayList<>();
        two.add(3);
        two.add(3);
        two.add(3);
        two.add(3);
        two.add(3);


        }
    }












