import java.util.Scanner;

public class TakeDiscountOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            long totalWithoutCoupon = 0;
            long totalWithCoupon = X;

            for (int i = 0; i < N; i++) {
                totalWithoutCoupon += A[i];
                totalWithCoupon += Math.max(0, A[i] - Y);
            }

            if (totalWithCoupon < totalWithoutCoupon) {
                System.out.println("COUPON");
            } else {
                System.out.println("NO COUPON");
            }
        }
        scanner.close();
    }
}
