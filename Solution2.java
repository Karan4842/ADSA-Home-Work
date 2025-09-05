<<<<<<<HEAD:Solution2.java
public class Solution2 {

    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int missing = arr[i] - (i + 1);

            // If missing >= k, answer lies before or at this index
            if (missing >= k) {
                return i + k;
            }
        }

        // If k-th missing is beyond the last element
        return n + k;
    }

    // Main method to test in VS Code
    public static void main(String[] args) {
        Solution2 sol = new Solution2();

        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 3;

        int result = sol.findKthPositive(arr, k);
        System.out.println("The " + k + "-th missing positive number is: " + result);
    }
}=======

public class findKthPositive2 {

    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int missing = arr[i] - (i + 1);

            // If missing >= k, answer lies before or at this index
            if (missing >= k) {
                return i + k;
            }
        }

        // If k-th missing is beyond the last element
        return n + k;
    }

    // Main method to test in VS Code
    public static void main(String[] args) {
        findKthPositive2 sol = new findKthPositive2();

        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 3;

        int result = sol.findKthPositive(arr, k);
        System.out.println("The " + k + "-th missing positive number is: " + result);
    }
}>>>>>>>b3c6124(

Rename Java files,add new solutions,
update Solution.java):findKthPositive2.
java
