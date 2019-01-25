package com.company;

class TaskSixth {
    TaskFifth fifth = new TaskFifth();
    int[] array = fifth.array;
    int i;

    void showEvenOdd() {
        int counterEven = 0;
        int counterOdd = 0;

        System.out.print("Четные числа: ");
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counterEven = 1;
                System.out.print(array[i] + " ");
            }
        }
        if (counterEven != 1) System.out.println("Таких чисел нет! :(");

        System.out.print("\nНечетные числа: ");
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                counterOdd = 1;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        if (counterOdd != 1) System.out.println("Таких чисел нет! :(");
    }

    void showMaxMin() {
        int max = array[0];
        int min = array[0];
        System.out.print("Максимальное число: ");
        for (i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

        System.out.print("Минимальное число: ");
        for (i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    void showNumbers() {
        int counter1 = 0;
        System.out.print("Числа, которые делятся на 3 или на 9: ");
        for (i = 0; i < array.length; i++) {
            if ((array[i] % 3 == 0) || (array[i] % 9 == 0)) {
                counter1 = 1;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        if (counter1 != 1) System.out.println("Таких чисел нет! :(");
    }

    void showNumbersTwo() {
        int counter2 = 0;
        System.out.print("Числа, которые делятся на 5 и на 7: ");
        for (i = 0; i < array.length; i++) {
            if ((array[i] % 5 == 0) && (array[i] % 7 == 0)) {
                counter2 = 1;
                System.out.print(array[i] + " ");
            }
        }
        if (counter2 != 1) System.out.println("Таких чисел нет! :(");
    }

    void showNoSameNumber() {
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int counter = 0;
        System.out.print("/nВсе трехзначные числа, в десятичной записи которых нет одинаковых цифр: ");
        for (int i = 0; i < array.length; i++) {
            if ((array[i] > 99) && (array[i] < 1000)) {
                firstNumber = array[i] / 100;
                secondNumber = array[i] / 10 % 10;
                thirdNumber = array[i] % 100 % 10;
                if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
                    counter = 1;
                    System.out.print(array[i] + " ");
                }
            }
        }
        if (counter != 1)
            System.out.print("Таких чисел нет! :(");
    }

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
        for (int i = 0; i < array.length; i++) {
            if ((array[i] > 99999) && (array[i] < 1000000)) {
                firstThree = array[i] / 1000;
                secondThree = array[i] % 1000;
                a1 = firstThree / 100;
                b1 = firstThree / 10 % 10;
                c1 = firstThree % 100 % 10;
                a2 = secondThree / 100;
                b2 = secondThree / 10 % 10;
                c2 = secondThree % 100 % 10;
                sumFirstThree = a1 + b1 + c1;
                sumSecondThree = a2 + b2 + c2;
                /*while (firstThree != 0) {
                    sumFirstThree = sumFirstThree + firstThree % 10;
                    firstThree = firstThree / 10;
                }
                while (secondThree != 0) {
                    sumSecondThree = sumSecondThree + secondThree % 10;
                    secondThree = secondThree / 10;
                }*/
                if (sumFirstThree == sumSecondThree) {
                    counter3 = 1;
                    System.out.print(array[i] + " ");
                } 
            }
        }
        if (counter3!=1)
            System.out.println("Таких чисел нет! :(");
    }
}
