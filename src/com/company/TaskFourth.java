package com.company;

import java.util.Scanner;

class TaskFourth {
    private Scanner scan = new Scanner(System.in);
    String pass1 = "qwerty";
    String pass2;

    void comparePasswords() {
        System.out.print("Введите пароль: ");
        pass2 = scan.nextLine();
        if (pass1.equals(pass2)) {
            System.out.println("Пароль совпадает с образцом.");
        } else System.out.println("Вы ввели неверный пароль!!");
    }
}
