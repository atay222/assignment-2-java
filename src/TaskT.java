import java.util.Scanner;

public class TaskT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            if (x1 == 0) x1 = 0;
            if (x2 == 0) x2 = 0;

            System.out.println(x1 + " " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);

            if (x == 0) x = 0;

            System.out.println(x);
        }
    }
}