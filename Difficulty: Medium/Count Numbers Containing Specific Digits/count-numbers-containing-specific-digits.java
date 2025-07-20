class Solution {
    public int countValid(int n, int[] arr) {
        Set<Integer> requiredDigits = new HashSet<>();
        for (int digit : arr) {
            requiredDigits.add(digit);
        }

        Set<Integer> allDigits = new HashSet<>();
        for (int i = 0; i <= 9; i++) {
            allDigits.add(i);
        }

        Set<Integer> forbiddenDigits = new HashSet<>(allDigits);
        forbiddenDigits.removeAll(requiredDigits);

        int totalNDigit = 9 * (int)Math.pow(10, n - 1);
        int forbiddenCount = countUsingOnlyDigits(n, forbiddenDigits);

        return totalNDigit - forbiddenCount;
    }

    private int countUsingOnlyDigits(int n, Set<Integer> allowedDigits) {
        if (allowedDigits.isEmpty()) return 0;

        List<Integer> digits = new ArrayList<>(allowedDigits);
        int k = digits.size();
        int count = 0;

        for (int d : digits) {
            if (d == 0) continue;
            count += Math.pow(k, n - 1);
        }

        return count;
    }
}
