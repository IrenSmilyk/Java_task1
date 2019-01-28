/*-----Ввести с консоли n целых чисел. На консоль вывести:--------------------------------------------------------------
          - Четные и нечетные числа.
          - Наибольшее и наименьшее число.
          - Числа, которые делятся на 3 или на 9.
          - Числа, которые делятся на 5 и на 7.
          - Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
          - «Счастливые» числа.*/
package com.company;

import java.util.Scanner;

class TaskSixth {
    private int i;
    private int[] arrayNum;

    //--Ввеод с консоли n целых чисел.
    void setArray2() {
        System.out.print("Введите числа: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] array = s.split("\\s+");
        arrayNum = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayNum[i] = Integer.parseInt(array[i]);
        }
    }

    //--Четные и нечетные числа.--
    void showEvenOdd() {
        int counterEven = 0;
        int counterOdd = 0;

        System.out.print("Четные числа: ");
        for (i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] % 2 == 0) {
                counterEven = 1;
                System.out.print(arrayNum[i] + " ");
            }
        }
        if (counterEven != 1) System.out.print("Таких чисел нет! :(");

        System.out.print("\nНечетные числа: ");
        for (i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] % 2 != 0) {
                counterOdd = 1;
                System.out.print(arrayNum[i] + " ");
            }
        }
        if (counterOdd != 1) System.out.print("Таких чисел нет! :(");
    }

    //--Наибольшее и наименьшее число.--
    void showMaxMin() {
        int max = arrayNum[0];
        int min = arrayNum[0];
        System.out.print("\nМаксимальное число: ");
        for (i = 1; i < arrayNum.length; i++) {
            if (arrayNum[i] > max) {
                max = arrayNum[i];
            }
        }
        System.out.println(max);

        System.out.print("Минимальное число: ");
        for (i = 1; i < arrayNum.length; i++) {
            if (arrayNum[i] < min) {
                min = arrayNum[i];
            }
        }
        System.out.println(min);
    }

    //--Числа, которые делятся на 3 или на 9.--
    void showNumbers() {
        int counter1 = 0;
        System.out.print("Числа, которые делятся на 3 или на 9: ");
        for (i = 0; i < arrayNum.length; i++) {
            if ((arrayNum[i] % 3 == 0) || (arrayNum[i] % 9 == 0)) {
                counter1 = 1;
                System.out.print(arrayNum[i] + " ");
            }
        }
        if (counter1 != 1) System.out.println("Таких чисел нет! :(");
    }

    //--Числа, которые делятся на 5 и на 7.--
    void showNumbersTwo() {
        int counter2 = 0;
        System.out.print("\nЧисла, которые делятся на 5 и на 7: ");
        for (i = 0; i < arrayNum.length; i++) {
            if ((arrayNum[i] % 5 == 0) && (arrayNum[i] % 7 == 0)) {
                counter2 = 1;
                System.out.print(arrayNum[i] + " ");
            }
        }
        if (counter2 != 1) System.out.print("Таких чисел нет! :(");
    }

    //--Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.--
    void showNoSameNumber() {
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int counter = 0;
        System.out.print("\nВсе трехзначные числа, в десятичной записи которых нет одинаковых цифр: ");
        for (int i = 0; i < arrayNum.length; i++) {
            if ((arrayNum[i] > 99) && (arrayNum[i] < 1000)) {
                firstNumber = arrayNum[i] / 100;
                secondNumber = arrayNum[i] / 10 % 10;
                thirdNumber = arrayNum[i] % 100 % 10;
                if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
                    counter = 1;
                    System.out.print(arrayNum[i] + " ");
                }
            }
        }
        if (counter != 1)
            System.out.print("Таких чисел нет! :(");
    }

    //--«Счастливые» числа.--
    void showLucky() {
        int firstThree;
        int secondThree;
        int a1;
        int b1;
        int c1;
        int a2;
        int b2;
        int c2;
        int sumFirstThree;
        int sumSecondThree;
        int counter3 = 0;
        System.out.print("\nСчастливые числа: ");
        for (int i = 0; i < arrayNum.length; i++) {
            if ((arrayNum[i] > 99999) && (arrayNum[i] < 1000000)) {
                firstThree = arrayNum[i] / 1000;
                secondThree = arrayNum[i] % 1000;
                a1 = firstThree / 100;
                b1 = firstThree / 10 % 10;
                c1 = firstThree % 100 % 10;
                a2 = secondThree / 100;
                b2 = secondThree / 10 % 10;
                c2 = secondThree % 100 % 10;
                sumFirstThree = a1 + b1 + c1;
                sumSecondThree = a2 + b2 + c2;
                if (sumFirstThree == sumSecondThree) {
                    counter3 = 1;
                    System.out.print(arrayNum[i] + " ");
                }
            }
        }
        if (counter3 != 1)
            System.out.println("Таких чисел нет! :(");
    }
}


