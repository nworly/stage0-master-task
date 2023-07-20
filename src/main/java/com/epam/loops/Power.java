package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int poweredNum = 1;
        for (int i = 0; i < power; i++) {
            poweredNum *= numberToPrint;
        }
        System.out.println(poweredNum);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
