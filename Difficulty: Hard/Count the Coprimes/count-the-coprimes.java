import java.util.*;

class Solution {
    static final int MAX = 100001; 

    int cntCoprime(int[] arr) {
        int n = arr.length;
        int[] freq = new int[MAX];
        int maxVal = 0;

        for (int num : arr) {
            freq[num]++;
            maxVal = Math.max(maxVal, num);
        }

        int[] divisibleCount = new int[maxVal + 1];
        for (int d = 1; d <= maxVal; d++) {
            for (int multiple = d; multiple <= maxVal; multiple += d) {
                divisibleCount[d] += freq[multiple];
            }
        }


        long[] gcdPairs = new long[maxVal + 1];
        for (int d = maxVal; d >= 1; d--) {
            long c = divisibleCount[d];
            gcdPairs[d] = c * (c - 1) / 2;
            for (int multiple = 2 * d; multiple <= maxVal; multiple += d) {
                gcdPairs[d] -= gcdPairs[multiple];
            }
        }
        return (int) gcdPairs[1];
    }
}



