package _11;

/**
 * @author weir
 */
public class Slution {
    public static void main(String[] args) {
        Slution slution = new Slution();
        int trap = slution.trap(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println("trap = " + trap);
    }

    public int trap(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                //计算面积
                int area = calcArea(i, j, height);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    private int calcArea(int i, int j, int[] height) {
        int min = Math.min(height[i], height[j]);
        return min * (j - i);
    }

}
