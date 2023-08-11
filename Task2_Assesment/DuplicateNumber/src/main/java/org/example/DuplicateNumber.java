package org.example;

import java.util.HashMap;
import java.util.Map;

class DuplicateNumber {
    public static void main(String[] args) {

        int[] array = {7, 1, 4, 43, 22, 4, 6, 73, 8};

        //function to find a duplicate number
        int duplicate = findDuplicate(array);

        if (duplicate != -1) {
            System.out.println("Duplicate number: " + duplicate);
        } else {
            System.out.println("No duplicate found");
        }
    }

    public static int findDuplicate(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > 1) {
                return num;
            }
        }

        return -1; // No duplicate found
    }
}

