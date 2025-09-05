import java.util.*;

public class ItsTimeToDuel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            boolean allOnes = true;
            boolean hasAdjacentZeros = false;

            for (int i = 0; i < n; i++) {
                if (a[i] == 0)
                    allOnes = false;
                if (i > 0 && a[i] == 0 && a[i - 1] == 0)
                    hasAdjacentZeros = true;
            }

            if (allOnes || hasAdjacentZeros) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
