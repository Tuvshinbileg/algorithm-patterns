package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoPointer {
    public static int[] run(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[2];
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int right = nums.length - 1;

        for (int i = 0; i < nums.length - 1; i++) {
            int target = nums[i] * -1;
            int left = i + 1;

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    break;
                }

                if (target > sum) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
