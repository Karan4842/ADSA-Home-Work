import java.util.Scanner;

public class CostofGroceries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // number of items
            int X = sc.nextInt(); // minimum freshness value

            int[] freshness = new int[N];
            int[] cost = new int[N];

            // Read freshness values
            for (int i = 0; i < N; i++) {
                freshness[i] = sc.nextInt();
            }

            // Read costs
            for (int i = 0; i < N; i++) {
                cost[i] = sc.nextInt();
            }

            // Calculate total cost for items with freshness >= X
            int totalCost = 0;
            for (int i = 0; i < N; i++) {
                if (freshness[i] >= X) {
                    totalCost += cost[i];
                }
            }

            System.out.println(totalCost);
        }

        sc.close();
    }
}
