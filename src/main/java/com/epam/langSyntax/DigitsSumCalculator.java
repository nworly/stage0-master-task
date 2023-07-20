package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = 0;

        for (; number != 0; number /= 10) {
            sum += number % 10;
        }

        System.out.println(sum);
    }

}
