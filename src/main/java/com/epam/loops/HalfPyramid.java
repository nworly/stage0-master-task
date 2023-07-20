package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        int distToMiddle = cathetusLength - 1;
        String emptyBlock = " ";
        String block = "*";

        for (int i = 1; i <= cathetusLength; i++) {
            System.out.print(emptyBlock.repeat(distToMiddle--) + block.repeat(i));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
