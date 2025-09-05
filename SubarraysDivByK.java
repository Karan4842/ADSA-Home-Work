class SubarraysDivByK {
    public int subarraysDivByK(int[] nums, int k) {
        // Map remainder -> frequency
        java.util.Map<Integer, Integer> countMap = new java.util.HashMap<>();
        countMap.put(0, 1); // empty prefix

        int prefixSum = 0;
        int result = 0;

        for (int num : nums) {
            prefixSum += num;
            int remainder = prefixSum % k;
            // handle negative remainders (Java keeps sign)
            if (remainder < 0)
                remainder += k;

            // if same remainder seen before, add its frequency
            result += countMap.getOrDefault(remainder, 0);

            // increment frequency
            countMap.put(remainder, countMap.getOrDefault(remainder, 0) + 1);
        }

        return result;
    }
}
