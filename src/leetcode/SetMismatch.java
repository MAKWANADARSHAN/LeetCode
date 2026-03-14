package leetcode;

import java.util.HashSet;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        int dupSum = 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            actualSum += num;
            if (!set.add(num)) dupSum = num;
        }

        int missing = expectedSum - (actualSum - dupSum);
        return new int[]{dupSum, missing};
    }
}
