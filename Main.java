package ru.gb.java_3.hw_4;
//1. Создать три потока, каждый из которых выводит определенную букву (A, B и C) 5 раз (порядок – ABСABСABС). Используйте wait/notify/notifyAll.
public class Main{
    public static void main(String[] args) {
        ABC abc = new ABC();
        Thread t1 = new Thread(() -> {
            abc.printChar('A','B');
        });
        Thread t2 = new Thread(() -> {
            abc.printChar('B','C');
        });
        Thread t3 = new Thread(() -> {
            abc.printChar('C', 'A');
        });
        t1.start();
        t2.start();
        t3.start();

    }
}
