package Exercise33;

import java.util.Scanner;

public class LeastCommonMultiple {
    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else if (a > b) {
            return gcd(a - b, b);

        } else {
            return gcd(a, b - a);
        }
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter a Firt Number: ");
        int a = myObj.nextInt();

        System.out.print("Enter a Second Number: ");
        int b = myObj.nextInt();
        System.out.println("Least Common Multiple :" + lcm(a, b));
    }

}
