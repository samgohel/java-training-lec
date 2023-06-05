package dsa_daily;

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
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] getIndexBruteforce(int[] input, int target) {
        int[] result = new int[2];
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                System.out.println("M");
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
}
