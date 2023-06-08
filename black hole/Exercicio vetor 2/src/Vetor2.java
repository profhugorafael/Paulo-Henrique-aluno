import java.util.Scanner;

public class Vetor2 {

	public static int[] dp = new int[61];

	public static int fib(int n) {

		if (dp[n] != -1) {
			return dp[n];
		}

		if (n == 0) {
			return dp[0] = 0;
		}

		if (n == 1) {
			return dp[1] = 1;
		}

		return dp[n] = fib(n - 1) + fib(n - 2);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Long t = input.nextLong();

		for (int i = 0; i < 61; i++)
			dp[i] = -1;

		for (int j = 0; j < t; j++) {
			int n = input.nextInt();
			System.out.println(fib(n));
		}
		input.close();
	}

}
