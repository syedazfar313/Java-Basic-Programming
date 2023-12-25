package Exercise20;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        int remainder;
        int decimal_number;

        String hex_num = "";

        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Decimal number :");
        decimal_number = in.nextInt();

        while (decimal_number > 0) {
            remainder = decimal_number % 16;
            hex_num = hex[remainder] + hex_num;
            decimal_number = decimal_number / 16;
        }

        System.out.println("Hexadecimal number is : " + hex_num);
    }
}
