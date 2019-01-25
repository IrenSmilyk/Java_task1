package com.company;

import java.util.Scanner;

class TaskFirst {
    void readName() {
        System.out.print("Введите Ваше имя: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Привет, " + name + "!");
    }
}
