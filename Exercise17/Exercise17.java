// 17. Write a Java program to add two binary numbers.
// Input Data:
// Input first binary number: 10
// Input second binary number: 11
// Expected Output

// Sum of two binary numbers: 101
package Exercise17;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        long binary1, binary2;
        int i = 0, remainder = 0;

        int[] sum = new int[20];

        Scanner sc = new Scanner(System.in);
        System.out.println("Binary number 1 :");
        binary1 = sc.nextLong();

        System.out.println("Binary number 2 :");
        binary2 = sc.nextLong();

        while (binary1 != 0 || binary2 != 0) {
            sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;
        System.out.println("the sum of two binary numbers is : ");
        while (i >= 0) {
            System.out.print(sum[i--]);

        }
        System.out.print("\n ");

    }

}
