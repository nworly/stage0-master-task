package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int distToMiddle = cathetusLength - 1;
        int sidesIncrement = 2;
        int numOfBlocks = 1;
        String emptyBlock = " ";

        for (int i = 1; i <= cathetusLength; i++) {
            if (distToMiddle > 0) {
                System.out.print(emptyBlock.repeat(distToMiddle--));
            }

            int currNum = i;

            for (int j = 0; j < numOfBlocks; j++) {
                System.out.print(currNum);
                if (j < numOfBlocks / 2) {
                    currNum--;
                } else {
                    currNum++;
                }
            }

            numOfBlocks += sidesIncrement;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
