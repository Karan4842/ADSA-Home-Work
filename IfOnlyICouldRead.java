import java.util.*;

public class IfOnlyICouldRead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            boolean found = false;
            for (int i = 0; i < N - 1; i++) {
                if (A[i] > A[i + 1]) {
                    System.out.println((i + 1) + " " + (i + 2));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
