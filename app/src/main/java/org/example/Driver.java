package org.example;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();

        int testOne = finder.linearSearch(sortedFuzzies);
        int testTwo = finder.binarySearch(sortedFuzzies);
        int testThree = finder.linearSearch(randomFuzzies);
        int testFour = finder.binarySearch(randomFuzzies);

        System.out.println("Test 1 (Linear - Sorted): Index " + testOne);
        System.out.println("Test 2 (Binary - Sorted): Index " + testTwo);
        System.out.println("Test 3 (Linear - Random): Index " + testThree);
        System.out.println("Test 4 (Binary - Random): Index " + testFour);
    }
}