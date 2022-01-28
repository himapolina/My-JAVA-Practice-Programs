import java.util.*;
class q1 {
	static int maxGameByWinner(int N)
	{
		int[] dp = new int[N];
		dp[0] = 1;
		dp[1] = 2;
		int i = 2;
		do {
			dp[i] = dp[i - 1] + dp[i - 2];
		} while (dp[i++] <= N);
		return (i - 2);
	}
	public static void main(String args[])
	{
        Scanner sc= new Scanner(System.in);
		int N;
        System.out.println("How many players have you invited?");
        N =  sc.nextInt();
		System.out.println("Maximum games played by the winner = "+maxGameByWinner(N));
	}
}

