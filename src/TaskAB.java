import java.util.Scanner;

public class TaskAB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        while (x >= 100) {
            System.out.print("C");
            x -= 100;
        }
        while (x >= 90) {
            System.out.print("XC");
            x -= 90;
        }
        while (x >= 50) {
            System.out.print("L");
            x -= 50;
        }
        while (x >= 40) {
            System.out.print("XL");
            x -= 40;
        }
        while (x >= 10) {
            System.out.print("X");
            x -= 10;
        }
        while (x >= 9) {
            System.out.print("IX");
            x -= 9;
        }
        while (x >= 5) {
            System.out.print("V");
            x -= 5;
        }
        while (x >= 4) {
            System.out.print("IV");
            x -= 4;
        }
        while (x >= 1) {
            System.out.print("I");
            x -= 1;
        }
    }
}