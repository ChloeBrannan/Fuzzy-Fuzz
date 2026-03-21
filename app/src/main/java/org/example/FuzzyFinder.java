package org.example;

import java.util.ArrayList;

public class FuzzyFinder {

    public int linearSearch(ArrayList<Fuzzy> fuzzies) {
        for (int i = 0; i < fuzzies.size(); i++) {
            if (fuzzies.get(i).color.equals("gold")) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(ArrayList<Fuzzy> fuzzies) {
        int low = 0;
        int high = fuzzies.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            String midColor = fuzzies.get(mid).color;

            if (midColor.equals("gold")) {
                return mid;
            }

            if (midColor.compareTo("gold") < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}