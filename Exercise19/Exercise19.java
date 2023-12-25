// 19. Write a Java program to convert an integer number to a binary number.
// Input Data:
// Input a Decimal Number : 5
// Expected Output

// Binary number is: 101 
package Exercise19;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        // declare a varible to store values
        int decimal_number, qout, i = 1, j;
        int[] bin_num = new int[100];

        // create a scanner object
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your decimal Number: ");
        decimal_number = in.nextInt();
        qout = decimal_number;

        while (qout != 0) {
            bin_num[i++] = qout % 2;
            qout = qout / 2;
        }
        System.out.print("Binary number is :");
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin_num[j]);
        }
    }
}
