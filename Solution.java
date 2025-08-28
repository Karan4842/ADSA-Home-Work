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
