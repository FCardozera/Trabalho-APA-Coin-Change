import java.util.Scanner;

public class CoinProblem {

    public static long contarFormas(int n, int[] c) {
        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (int i = 0; i < c.length; i++) {
            for (int j = c[i]; j <= n; j++) {
                dp[j] += dp[j - c[i]];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int[] moedas = new int[m];
            for (int i = 0; i < m; i++) {
                moedas[i] = scanner.nextInt();
            }

            long formas = contarFormas(n, moedas);

            System.out.println(formas);
        }
    }
}