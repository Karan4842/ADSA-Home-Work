import java.util.Scanner;

public class DifficultyRatingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            boolean nonDecreasing = true;
            for (int i = 1; i < N; i++) {
                if (arr[i] < arr[i - 1]) {
                    nonDecreasing = false;
                    break;
                }
            }

            if (nonDecreasing) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
