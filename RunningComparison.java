import java.util.Scanner;

public class RunningComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt(); // number of days
            int[] A = new int[N];
            int[] B = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt(); // Alice's distance
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt(); // Bob's distance
            }

            int happyDays = 0;
            for (int i = 0; i < N; i++) {
                if (B[i] <= 2 * A[i] && A[i] <= 2 * B[i]) {
                    happyDays++;
                }
            }
            // You may want to print the result
            System.out.println(happyDays);
        }
        sc.close();
    }
}