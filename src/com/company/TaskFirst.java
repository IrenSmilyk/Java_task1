//-----Приветствовать любого пользователя при вводе его имени через командную строку------------
package com.company;

import java.util.Scanner;

class TaskFirst {
    void readName() {
        System.out.print("Введите Ваше имя: ");
        //Scanner scan = new Scanner(System.in);
        String name = new Scanner(System.in).nextLine();
        System.out.printf("Привет, %s!\n", name);
    }
}
