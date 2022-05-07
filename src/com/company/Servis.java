package com.company;

import java.util.Scanner;

public class Servis {
    public void SearchNumber() {
        //1) Найти сумму элементов каждого столбца в матрице
        int[][] ary = {{3, 5, 2, 1}, {4, 2, 4, 5}, {4, 2, 6, 8}};
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 0; i < ary.length; i++) {
            sum += ary[i][0];
            sum1 += ary[i][1];
            sum2 += ary[i][2];
            sum3 += ary[i][3];
            for (int j = 0; j < ary[i].length; j++) {
                System.out.print(ary[i][j] + "\t");

            }
            System.out.println();

        }
        System.out.print(sum + "\t" + sum1 + "\t" + sum2 + "\t" + sum3);


    }

    // Построить матрицу из звёздочек в зависимости от введенного n
    public void Zvezda() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер матрицы ");
        int simbol = scanner.nextInt();
        String[][] array = new String[simbol][simbol];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i; j++) {
                array[i][j] = "* ";
                System.out.print(array[i][j]);

            }
            System.out.println();
        }
    }

    //Найти среднее арифметическое для каждой строки матрицы
    public void Midle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину ");
        int vvod = scanner.nextInt();
        int[][] mas = new int[vvod][vvod];

        int numbermid = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = scanner.nextInt();
                System.out.print(mas[i][j] + "\t");
                if (i == 0) {
                    numbermid += mas[0][0] + mas[0][1];
                }
                System.out.println();
            }
            System.out.println(numbermid / mas.length);


        }



}public void functio(){
        String a = "100";
        String b= "50";
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);

        int c = A+B;
        System.out.println(c);
    }
}


