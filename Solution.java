<<<<<<< HEAD
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int left = 0, right = n - 1;
        
        // Binary search for the first index where missing numbers >= k
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // missing numbers before arr[mid]
            int missing = arr[mid] - (mid + 1);
            
            if (missing < k) {
                left = mid + 1; // need to go right
            } else {
                right = mid - 1; // possible answer, go left
            }
        }
        
        // Answer is left + k
        return left + k;
    }
}
=======
class Solution {
    static final int MOD = 1_000_000_007;
    static final int MAX = 100_000; // s.length <= 1e5

    long[] fact = new long[MAX + 1];
    long[] invFact = new long[MAX + 1];

    public Solution() {
        precomputeFactorials();
    }

    public int countAnagrams(String s) {
        String[] words = s.split(" ");
        long ans = 1;

        for (String word : words) {
            int[] freq = new int[26];
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }

            long ways = fact[word.length()];
            for (int count : freq) {
                if (count > 1) {
                    ways = (ways * invFact[count]) % MOD;
                }
            }
            ans = (ans * ways) % MOD;
        }

        return (int) ans;
    }

    // ---------- Helpers ----------

    private void precomputeFactorials() {
        fact[0] = 1;
        for (int i = 1; i <= MAX; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        invFact[MAX] = modPow(fact[MAX], MOD - 2); // Fermat inverse
        for (int i = MAX - 1; i >= 0; i--) {
            invFact[i] = (invFact[i + 1] * (i + 1)) % MOD;
        }
    }

    private long modPow(long base, long exp) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }
}
>>>>>>> b3c6124 (Rename Java files, add new solutions, update Solution.java)
