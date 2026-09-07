package leetcode;

public class indtheLargestAlmostMissingInteger {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if (k == n) {
            int max = Integer.MIN_VALUE;
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return max;
        }
        int[] count = new int[51];
        for (int num : nums) {
            count[num]++;
        }
        int max = -1;
        if (k == 1) {
            for (int num : nums) {
                if (count[num] == 1) {
                    max = Math.max(max, num);
                }
            }
            return max;
        }
        if (count[nums[0]] == 1) {
            max = Math.max(max, nums[0]);
        }
        if (count[nums[n - 1]] == 1) {
            max = Math.max(max, nums[n - 1]);
        }
        return max;
    }
}
