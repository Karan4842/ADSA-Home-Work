import java.util.Scanner;

public class FindMaximumInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of testcases

        while (T-- > 0) {
            int N = sc.nextInt(); // size of array
            int[] arr = new int[N];

            // read array elements
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            // find maximum
            int max = arr[0];
            for (int i = 1; i < N; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            // print tallest mountain
            System.out.println(max);
        }
        sc.close();
    }
}
