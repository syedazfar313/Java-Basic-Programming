//  Write a Java program and compute the sum of an integer's digits.
// Input Data:
// Input an integer: 25
// Expected Output
// The sum of the digits is: 7

package Exercise24;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            long n = myObj.nextLong();
            System.out.println("The sum of the digits is: " + sumDigits(n));
        }

    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
