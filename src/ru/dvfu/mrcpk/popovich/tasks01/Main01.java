package ru.dvfu.mrcpk.popovich.tasks01;

// Задача нахождения младшего разряда числа

import java.util.Scanner;

public class Main01 {

    public int getSum(int x, int y){
        return x + y;
    }

    // Главный метод
    public static void main(String[] args) {



        System.out.println("Введите значение х:");

        Scanner in = new Scanner(System.in);


        int x = in.nextInt();

        System.out.println("Введенное значение х = " + x);

        int y = x % 10;

        System.out.println("Младший разряд числа, y = " + String.valueOf(y));
    }


}