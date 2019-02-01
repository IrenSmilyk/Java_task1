//-----Отобразить в окне консоли аргументы командной строки в обратном порядке------------------
package com.company;

class TaskSecond {
    void showNumbers(String[] array) {
        System.out.print("Аргументы командной строки: ");
       /* for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }*/
        for (String i : array) System.out.print(i + " ");
        System.out.print("\nАргументы в обратном порядке: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
