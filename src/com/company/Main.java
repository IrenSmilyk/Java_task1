package com.company;

public class Main {

    public static void main(String[] args) {

        TaskFirst first = new TaskFirst();
        first.readName();
        TaskSecond second = new TaskSecond();
        second.showNumbers(args);
        TaskThird third = new TaskThird();
        third.setLength();
        third.setArray();
        third.showArray();
        third.showLnArray();
        TaskFourth fourth = new TaskFourth();
        fourth.comparePasswords();
        TaskFifth fifth = new TaskFifth();
        fifth.showSumProd(args);
        TaskSixth sixth = new TaskSixth();
        sixth.setArray2();
        sixth.showEvenOdd();
        sixth.showMaxMin();
        sixth.showNumbers();
        sixth.showNumbersTwo();
        sixth.showNoSameNumber();
        sixth.showLucky();
    }
}
