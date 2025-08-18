package main.problems;

public class PreprocessingArray {
    public static int run(int[] nums, int k, int j) {
        int[] processed = new int[nums.length];
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            temp = temp + nums[i];
            processed[i] = temp;
        }
        return processed[j] - processed[k - 1];
    }
}
