package com.company;

import java.util.Random;
import java.util.Scanner;

class TaskFifth {
    private Scanner scan = new Scanner(System.in);
    int n = 6;
    int[] array = new int[n];
    private int sum = 0;
    private int prod = 1;

    void setArray2() {
        System.out.println("Введите " + n + " целые(-ых) числа(-ел):");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
    }

    /*void setRandArray() {
        Random ran = new Random();
        System.out.println("Случайные " + 5 + " целые(-ых) числа(-ел):");
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(10);
            System.out.println(array[i] + " ");
        }
    }*/

    void showSumProd() {
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            prod *= array[i];
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + prod);
    }
}
