//-----Вывести заданное количество случайных чисел с переходом и без перехода на новую строку---
package com.company;

import java.util.Random;
import java.util.Scanner;

class TaskThird {
    private int number = 0;
    private int [] array;
    private Scanner scan = new Scanner(System.in);
    private Random ran = new Random();

    void setLength() {
        System.out.print("Введите количество случайных чисел: ");
        number = scan.nextInt();
        array = new int[number];
    }

    void setArray() {
        for (int i = 0; i < number; i++) {
            array[i] = ran.nextInt(100);
        }
    }

    void showArray() {
        System.out.print(number + " случайных чисел(-ла) без перехода на новую строку: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void showLnArray() {
        System.out.println(number + " случайных чисел(-ла) c перехода на новую строку: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
