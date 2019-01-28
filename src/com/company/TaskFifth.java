//-----Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль---
package com.company;

class TaskFifth {

    private int sum = 0;
    private long prod = 1;

    void showSumProd(String[] args) {
        System.out.print("Аргументы командной строки: ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
            prod *= Integer.parseInt(args[i]);
        }
        System.out.println("\nСумма: " + sum);
        System.out.println("Произведение: " + prod);
    }
}
