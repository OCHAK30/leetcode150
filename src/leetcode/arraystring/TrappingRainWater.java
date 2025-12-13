package leetcode.arraystring;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int n = height.length;
        int[] prefixMax = new int[n];

        prefixMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i-1],height[i]);
        }

        int[] suffixMax = new int[n];

        suffixMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i+1],height[i]);
        }

        int totalUnitsOfWater = 0;
        for (int i = 0; i < n; i++) {
            int leftMax = prefixMax[i];
            int rightMax = suffixMax[i];

            if(height[i] < leftMax && height[i] < rightMax) {
                totalUnitsOfWater += Math.min(leftMax, rightMax) - height[i];
            }
        }
        return totalUnitsOfWater;
    }
}
