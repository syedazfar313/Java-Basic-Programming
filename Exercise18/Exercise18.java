package Exercise18;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        int binary1, binary2, multiply = 0;
        int digit, factor = 1;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first binary Number: ");
        binary1 = in.nextInt();

        System.out.println("Enter second  binary Number: ");
        binary2 = in.nextInt();

        while (binary2 != 0) {
            digit = binary2 % 10;
            if (digit == 1) {
                multiply = binaryproduct(binary1, multiply);
            }
            binary1 = binary1 * 10; // Fix: Move this line outside the if-else block
            binary2 = binary2 / 10;
        }
        System.out.println("The product of two binary numbers: " + multiply + "\n");
    }

    // Fix: Corrected the parameters in the method declaration
    static int binaryproduct(int binary1, int multiply) {
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        int binary_prod_result = 0;

        while (binary1 != 0 || multiply != 0) {
            sum[i++] = (binary1 % 10 + multiply % 10 + remainder) % 2;
            remainder = (binary1 % 10 + multiply % 10 + remainder) / 2;
            binary1 = binary1 / 10;
            multiply = multiply / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }

        i--;
        while (i >= 0) {
            binary_prod_result = binary_prod_result * 10 + sum[i--];
        }

        return binary_prod_result;
    }
}
