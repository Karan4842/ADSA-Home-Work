import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            List<Long> results = new ArrayList<>();

            long power = 10;
            for (int k = 1; k <= 18; k++) {
                long divisor = power + 1;
                if (n % divisor == 0) {
                    long x = n / divisor;
                    results.add(x);
                }
                power *= 10;
            }

            if (results.isEmpty()) {
                System.out.println(0);
            } else {
                Collections.sort(results);
                System.out.print(results.size());
                for (long x : results) {
                    System.out.print(" " + x);
                }
                System.out.println();
            }
        }
    }
}
