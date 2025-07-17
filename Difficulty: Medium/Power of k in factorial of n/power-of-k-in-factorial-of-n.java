class Solution {
    public int maxKPower(int n, int k) {
        Map<Integer, Integer> factors = new HashMap<>();
        for (int i = 2; i * i <= k; i++) {
            while (k % i == 0) {
                factors.put(i, factors.getOrDefault(i, 0) + 1);
                k /= i;
            }
        }
        if (k > 1) {
            factors.put(k, 1);
        }

        int result = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : factors.entrySet()) {
            int prime = entry.getKey();
            int exponent = entry.getValue();
            int count = 0;
            int temp = n;
            while (temp > 0) {
                temp /= prime;
                count += temp;
            }
            result = Math.min(result, count / exponent);
        }

        return result;
    }
}
