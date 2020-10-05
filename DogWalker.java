package com;

public class DogWalker {

    public int numberOfWalksCalculator(int[] dogSizes) {
        int numberOfWalks = -1;
        for (int i = 0; i < dogSizes.length; i++) {
            numberOfWalks = (dogSizes[i]/2+5);
        }

        return numberOfWalks;
    }
}
