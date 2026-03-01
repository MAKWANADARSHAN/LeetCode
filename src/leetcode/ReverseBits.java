package leetcode;

public class ReverseBits {
    public int reverseBits(int n) {

        int result = 0;

        for (int i = 0; i < 32; i++) {

            result = result << 1;     // make space

            result = result | (n & 1); // add last bit

            n = n >>> 1;              // shift right
        }

        return result;
    }
}
