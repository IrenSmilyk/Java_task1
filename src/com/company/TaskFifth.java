//-----Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль---
package com.company;

class TaskFifth {

   /* private int sum = 0;
    private long prod = 1;*/

    void showSumProd(String[] args) {
        int sum = 0;
        long prod = 1;
        System.out.print("Аргументы командной строки: ");
        /*for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }*/
        for (String i : args) System.out.print(i + " ");
        /*for (int i = 0; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
                prod *= Integer.parseInt(args[i]);
            }*/
        for (String i:args){
            sum += Integer.parseInt(i);
            prod *= Integer.parseInt(i);
        }
        System.out.println("\nСумма: " + sum);
        System.out.println("Произведение: " + prod);
    }
}
