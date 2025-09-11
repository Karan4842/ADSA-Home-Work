class findKthPositive {
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

    // Main method to test
    public static void main(String[] args) {
        findKthPositive solver = new findKthPositive();

        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;

        int result = solver.findKthPositive(arr, k);
        System.out.println("The " + k + "th missing number is: " + result);
    }
}
