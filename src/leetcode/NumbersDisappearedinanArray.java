package leetcode;

import java.util.ArrayList;
import java.util.List;

public class NumbersDisappearedinanArray {

//    public List<Integer> findDisappearedNumbers1(int[] nums) {
//        List<Integer> res = new ArrayList<>();
//        for (int i = 1; i <= nums.length; i++) {
//            boolean flag = false;
//            for (int num : nums) {
//                if (num == i) {
//                    flag = true;
//                    break;
//                }
//            }
//            if (!flag) {
//                res.add(i);
//            }
//        }
//        return res;
//    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
