package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int reversed = 0;

        while (number > 0) {
            int current = number % 10;
            reversed = reversed * 10 + current;
            number /= 10;
        }

        System.out.println(reversed);
    }

}
