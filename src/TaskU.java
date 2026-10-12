import java.util.Scanner;
import java.util.Arrays;

public class TaskU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c;

        if (max >= sum - max) {
            System.out.println("impossible");
        } else {
            int x = Math.min(a, Math.min(b, c));
            int y = sum - max - x;

            int squareMax = max * max;
            int squareOther = x * x + y * y;

            if (squareMax == squareOther) {
                System.out.println("right");
            } else if (squareMax < squareOther) {
                System.out.println("acute");
            } else {
                System.out.println("obtuse");
            }
        }
    }
}