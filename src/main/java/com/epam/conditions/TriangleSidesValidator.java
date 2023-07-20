package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide == thirdSide
                || secondSide + thirdSide == firstSide
                || firstSide + thirdSide == secondSide
                || firstSide == secondSide
                || secondSide == thirdSide
                || firstSide == thirdSide) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }

}
