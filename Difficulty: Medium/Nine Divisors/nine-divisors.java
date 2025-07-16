class Solution {
    public static int countNumbers(int n) {
        int count = 0;

        int sqrtN = (int)Math.sqrt(n);
        List<Integer> primes = generatePrimes(sqrtN);

        for (int p : primes) {
            long power = 1;
            for (int i = 0; i < 8; i++) {
                power *= p;
                if (power > n) break;
            }
            if (power <= n)
                count++;
        }

        int len = primes.size();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                long product = (long)primes.get(i) * primes.get(i) * primes.get(j) * primes.get(j);
                if (product <= n)
                    count++;
                else
                    break; 
            }
        }

        return count;
    }
    
    static List<Integer> generatePrimes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i)
                    isPrime[j] = false;
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i])
                primes.add(i);
        }
        return primes;
    }
}