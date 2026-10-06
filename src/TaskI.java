import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        // Числитель всегда равен 0
        if (a == 0) {
            if (b == 0) {
                // 0 / (cx + d) = 0 для всех x,
                // кроме одного значения, где знаменатель = 0
                System.out.println("INF");
            } else {
                System.out.println("NO");
            }
        } else {
            // x = -b / a должен быть целым
            if (b % a != 0) {
                System.out.println("NO");
            } else {
                int x = -b / a;

                // Знаменатель не должен быть равен 0
                if (c * x + d == 0) {
                    System.out.println("NO");
                } else {
                    System.out.println(x);
                }
            }
        }
    }
}