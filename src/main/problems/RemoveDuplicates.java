package main.problems;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int[] countsDuplicates = new int[nums.length];

        for (int i = 0; i < nums.length - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            countsDuplicates[i] = count;
        }
        return 0;
    }
}
