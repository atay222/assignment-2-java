import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int price = a * 100 + b;
        int paid = c * 100 + d;

        int change = paid - price;

        int e = change / 100;
        int f = change % 100;

        System.out.println(e + " " + f);
    }
}