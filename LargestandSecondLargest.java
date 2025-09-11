import java.util.Scanner;

public class LargestandSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // size of array
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int max1 = Integer.MIN_VALUE; // largest
            int max2 = Integer.MIN_VALUE; // second largest

            for (int x : A) {
                if (x > max1) {
                    max2 = max1;
                    max1 = x;
                } else if (x > max2 && x != max1) {
                    max2 = x;
                }
            }

            System.out.println(max1 + max2);
        }
        sc.close();
    }
}
