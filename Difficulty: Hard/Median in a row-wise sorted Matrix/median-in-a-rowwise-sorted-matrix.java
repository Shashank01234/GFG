class Solution {
    public int median(int[][] mat) {
        final int n = mat.length;
        final int m = mat[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            low = Math.min(low, mat[i][0]);      
            high = Math.max(high, mat[i][m - 1]); 
        }

        int req = (n * m) / 2; 

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int k = countLE(mat, mid); 
            if (k <= req) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low; 
    }

    private int countLE(int[][] mat, int x) {
        int count = 0;
        for (int[] row : mat) {
            int lo = 0, hi = row.length - 1;
            while (lo <= hi) {
                int md = lo + (hi - lo) / 2;
                if (row[md] <= x) {
                    lo = md + 1; 
                } else {
                    hi = md - 1;
                }
            }
            count += lo;
        }
        return count;
    }
}
