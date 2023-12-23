package Exercise17;

import java.util.Scanner;

public class Exercise17p2 {
    public static void main(String[] args) {
        int bin1, bin2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];

        // create object of acanner
        Scanner in = new Scanner(System.in);

        // take a binary input from user
        System.out.print("Enter first binary Number :");
        bin1 = in.nextInt();
        System.out.print("Enter first binary Number :");
        bin2 = in.nextInt();
        while (bin1 != 0 || bin2 != 0) {
            sum[i++] = ((bin1 % 10 + bin2 % 10 + remainder) % 2);
            remainder = ((bin1 % 10 + bin2 % 10 + remainder) / 2);
            bin1 = bin1 / 10;
            bin2 = bin2 / 10;

        }
        if (remainder != 0) {
            sum[i++] = remainder;

        }
        --i;
        System.out.print("the sum of two Binary NUmber is :");
        while (i >= 0) {
            System.out.print(sum[i--]);

        }
        System.out.println("\n");

    }

}
