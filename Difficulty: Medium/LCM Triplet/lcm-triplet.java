class Solution {
    int lcmTriplets(int n) {
        if (n <= 2) return n;
        
        long result;
        if (n % 2 != 0) {
            result = 1L * n * (n - 1) * (n - 2);
        } else {
            if (n % 3 != 0) {
                result = 1L * n * (n - 1) * (n - 3);
            } else {
                result = 1L * (n - 1) * (n - 2) * (n - 3);
            }
        }
        return (int) result;
    }
}