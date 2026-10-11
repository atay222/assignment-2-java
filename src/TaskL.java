import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int time;

        if (n <= k) {
            time = 2 * m;
        } else {
            int batches = (2 * n + k - 1) / k;
            time = batches * m;
        }

        System.out.println(time);
    }
}