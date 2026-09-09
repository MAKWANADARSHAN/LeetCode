package leetcode;

public class Unique3DigitEvenNumbers {
    public int totalNumbers(int[] digits) {
        int count[] = new int[10];
        for (int num : digits) {
            count[num]++;
        }
        int result = 0;
        for (int i = 100; i <= 998; i += 2) {
            int ones = i % 10;
            int tens = (i / 10) % 10;
            int hundreds = i / 100;
            int[] temp = count.clone();
            if (temp[hundreds]-- > 0 && temp[tens]-- > 0 && temp[ones]-- > 0) {
                result++;
            }
        }
        return result;
    }
}
