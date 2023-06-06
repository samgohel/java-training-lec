package dsa_daily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /*
        Given an array of integers nums and an integer target , return indices
        of the two numbers such that they add up to target
        You may assume that each input would have exactly one solution, and
        you may not use the same element twice.
        You can return the answer in any order.
    */

    public static void main(String[] args) {
        // given
        // int array, int target
        // task
        // return index to sum=target
        int[] array = {1, 2, 4, 5, 8, 5, 8, 9, 5, 6};
        int target = 13;
        int[] result = getIndexBruteforce(array, target);
        int[] result2 = getIndexUsingHashMap(array, target);
        int[] result3 = getIndexUsingTwoPointer(array, target);
        for (int j : result) {
            System.out.print(j + " ");
        }

        for (int j : result2) {
            System.out.print(j + " ");
        }

        for (int j : result3) {
            System.out.print(j + " ");
        }
    }

    public static int[] getIndexBruteforce(int[] input, int target) {
        int[] result = new int[2];
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                int sum = input[i] + input[j];
                if (sum == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }

        return result;
    }

    public static int[] getIndexUsingHashMap(int[] input, int target) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            int copl = target - input[i];
            if (result.containsKey(copl)) {
                return new int[]{result.get(copl), i};
            } else {
                result.put(input[i], i);
            }
        }
        return new int[]{};
    }

    public static int[] getIndexUsingTwoPointer(int[] input, int target) {
        Arrays.sort(input);
        int left = 0;
        int right = input.length - 1;
        while (left < right) {
            if (input[left] + input[right] == target) {
                return new int[]{input[left], input[right]};
            } else if (input[left] + input[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }
}
