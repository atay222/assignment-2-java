import java.util.Scanner;

public class TaskX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int bestCost = Integer.MAX_VALUE;
        int bestTrips = Integer.MAX_VALUE;
        int b1 = 0, b5 = 0, b10 = 0, b20 = 0, b60 = 0;

        for (int a = 0; a <= n / 1 + 1; a++) {
            for (int b = 0; b <= n / 5 + 1; b++) {
                for (int c = 0; c <= n / 10 + 1; c++) {
                    for (int d = 0; d <= n / 20 + 1; d++) {
                        int remaining = n - a - 5 * b - 10 * c - 20 * d;
                        int e = Math.max(0, (remaining + 59) / 60);

                        int trips = a + 5 * b + 10 * c + 20 * d + 60 * e;
                        int cost = 15 * a + 70 * b + 125 * c + 230 * d + 440 * e;

                        if (cost < bestCost || (cost == bestCost && trips > bestTrips)) {
                            bestCost = cost;
                            bestTrips = trips;
                            b1 = a;
                            b5 = b;
                            b10 = c;
                            b20 = d;
                            b60 = e;
                        }
                    }
                }
            }
        }

        System.out.println(b1 + " " + b5 + " " + b10 + " " + b20 + " " + b60);
    }
}