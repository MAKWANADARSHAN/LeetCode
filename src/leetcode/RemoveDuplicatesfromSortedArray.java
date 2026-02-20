package leetcode;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int slow = 0;
        int fast = 1;
        while (fast < nums.length) {
            if (nums[slow] == nums[fast]) {
                fast++;
            } else if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }

        }
        return slow+1;
    }
}
