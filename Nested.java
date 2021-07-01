import java.util.Scanner;

class Nested {
    public static void main(String args[]) {

        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.print("Largest is:" + a);
            } else {
                System.out.print("Largest is:" + c);
            }
        } else {
            if (b > c) {
                System.out.print("Largest is:" + b);
            } else {
                System.out.print("Largest is:" + c);
            }
        }

    }
}