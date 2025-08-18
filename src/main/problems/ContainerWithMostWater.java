package main.problems;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;

        while (left < right) {
            int width = Math.abs(right - left);
            int heightMin = Math.min(height[left], height[right]);
            int currentArea = width * heightMin;

            if (currentArea > area) {
                area = currentArea;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return area;
    }
}
