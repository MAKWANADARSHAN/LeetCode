package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ChooseKElementsWithMaximumSum {
    public long[] findMaxSum(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        long[] result = new long[n];

        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> Integer.compare(nums1[a], nums1[b]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long currentSum = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            int idx = indices[i];
            while (j < n && nums1[indices[j]] < nums1[idx]) {
                pq.offer(nums2[indices[j]]);
                currentSum += nums2[indices[j]];

                if (pq.size() > k) {
                    currentSum -= pq.poll();
                }
                j++;
            }
            result[idx] = currentSum;
        }
        return result;
    }
}
