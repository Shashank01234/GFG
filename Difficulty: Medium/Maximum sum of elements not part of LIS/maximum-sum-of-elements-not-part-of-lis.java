class Solution {
    public int nonLisMaxSum(int[] arr) {
        int n = arr.length;

        int[][] dp = new int[n][2];

        for (int i = 0; i < n; i++) {
            dp[i][0] = arr[i];
            dp[i][1] = 1;

            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {

                    if (dp[j][1] + 1 == dp[i][1]) {
                        dp[i][0] = Math.min(dp[i][0], dp[j][0] + arr[i]);
                    }

                    else if (dp[j][1] + 1 > dp[i][1]) {
                        dp[i][0] = dp[j][0] + arr[i];
                        dp[i][1] = dp[j][1] + 1;
                    }
                }
            }
        }

        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            maxLen = Math.max(maxLen, dp[i][1]);
        }

        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (dp[i][1] == maxLen) {
                minSum = Math.min(minSum, dp[i][0]);
            }
        }

        int total = 0;
        for (int val : arr) {
            total += val;
        }

        return total - minSum;
    }
}