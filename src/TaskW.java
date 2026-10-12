import java.util.Scanner;

public class TaskW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int bestCost = Integer.MAX_VALUE;
        int best1 = 0, best10 = 0, best60 = 0;

        for (int i = 0; i <= n / 60 + 1; i++) {
            for (int j = 0; j <= n / 10 + 1; j++) {
                int remaining = n - i * 60 - j * 10;
                int k = Math.max(0, (remaining + 0) / 1);

                int cost = i * 440 + j * 125 + k * 15;

                if (i * 60 + j * 10 + k >= n && cost < bestCost) {
                    bestCost = cost;
                    best1 = k;
                    best10 = j;
                    best60 = i;
                }
            }
        }

        System.out.println(best1 + " " + best10 + " " + best60);
    }
}