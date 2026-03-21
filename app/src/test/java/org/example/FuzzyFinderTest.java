package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class FuzzyFinderTest {

    @Test
    public void testLinearSearchSorted() {
        FuzzyListGenerator gen = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();
        ArrayList<Fuzzy> list = gen.sortedRainbowFuzzies();
        int index = finder.linearSearch(list);
        assertNotEquals(-1, index);
        assertEquals("gold", list.get(index).color);
    }

    @Test
    public void testBinarySearchSorted() {
        FuzzyListGenerator gen = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();
        ArrayList<Fuzzy> list = gen.sortedRainbowFuzzies();
        int index = finder.binarySearch(list);
        assertNotEquals(-1, index);
        assertEquals("gold", list.get(index).color);
    }

    @Test
    public void testLinearSearchRandom() {
        FuzzyListGenerator gen = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();
        ArrayList<Fuzzy> list = gen.randomizedRainbowFuzzies();
        int index = finder.linearSearch(list);
        assertNotEquals(-1, index);
        assertEquals("gold", list.get(index).color);
    }

    @Test
    public void testBinarySearchRandom() {
        FuzzyListGenerator gen = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();
        ArrayList<Fuzzy> list = gen.randomizedRainbowFuzzies();
        int index = finder.binarySearch(list);
        // This is expected to potentially return -1 or an incorrect value
        System.out.println("Binary search on random list result: " + index);
    }
}