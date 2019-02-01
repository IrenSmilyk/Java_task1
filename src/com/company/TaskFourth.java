//-----Ввести пароль из командной строки и сравнить его со строкой-образцом---------------------
package com.company;

import java.util.Scanner;

class TaskFourth {
    private Scanner scan = new Scanner(System.in);

    void comparePasswords() {
        String pass1 = "qwerty";
        System.out.print("Введите пароль: ");
        String pass2 = scan.nextLine();
        if (pass1.equals(pass2)) {
            System.out.println("Пароль совпадает с образцом.");
        } else System.out.println("Вы ввели неверный пароль!!");
    }
}
