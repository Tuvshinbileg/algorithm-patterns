package main;

import main.problems.TwoPointer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6};
        int[] idxs = {0, 1, 2, 3, 4, 5};
        int[] case1 = {2, 7, 11, 15};
        // 1, 3
//        System.out.println(main.problems.PreprocessingArray.run(nums, 4, 5));

        int[] nums1 = {-1, 0};
//        var result = main.problems.TwoPointer.run(case1, 9);

        int[] case_1 = {-1, 0, 1, 2, -1, -4};
        int[] case_3 = {0, 0, 0};
        var result = TwoPointer.threeSum(case_3);
        result.forEach(el -> System.out.println(Arrays.toString(el.toArray())));
    }
}