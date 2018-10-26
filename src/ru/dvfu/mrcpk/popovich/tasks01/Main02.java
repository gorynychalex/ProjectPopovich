package ru.dvfu.mrcpk.popovich.tasks01;

// Программа определения суммы введенных чисел

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите значение х: ");

        int x = in.nextInt();

        System.out.print("Введите значение y: ");

        int y = in.nextInt();

        // Арифметическая операция по вычислению суммы чисел и присвоение z
        int z = Main02.getSum(x, y);

        System.out.println("Сумма введенных чисел x + y = " + z);

    }

    public static int getSum(int x, int y){
        return x + y;
    }
}
