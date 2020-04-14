package ru.gb.java_3.hw_4;

public class ABC {
    private final Object mon = new Object();
    private volatile char startLetter = 'A';

    public void printChar(char currentLetter, char nextLetter){
        for (int i = 0; i < 5; i++) {
            synchronized (mon) {
                try {
                    while (startLetter != currentLetter)
                        mon.wait();
                    System.out.print(currentLetter);
                    startLetter = nextLetter;
                    mon.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
