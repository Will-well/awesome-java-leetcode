package com.blankj.medium._011.ON;

/**
 * 暴力求解
 *
 * @author weir
 */
@SuppressWarnings("ALL")
public class Slution {
    public static void main(String[] args) {
        Slution slution = new Slution();
        System.out.println("maxArea = " + slution.maxArea(new int[]{1, 1})); //1
        System.out.println("maxArea = " + slution.maxArea(new int[]{1,8,6,2,5,4,8,3,7})); /* 49 */
    }

    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            int grap = j - i;
            int area = height[i] < height[j] ? grap * height[i++] : grap * height[j--];
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}
