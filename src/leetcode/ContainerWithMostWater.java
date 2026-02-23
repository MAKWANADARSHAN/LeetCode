package leetcode;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int area = 0;
        while (i < j) {
            int tem = Math.min(height[i], height[j]) * (j - i);
            if (tem > area) {
                area = tem;
            }

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return area;
    }
}
