package Exercise21;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        int decimal_Number, remainder, qout, i = 0, j;
        int oct[] = new int[100];

        // create a object of scanner class
        Scanner in = new Scanner(System.in);
        System.out.print("Enter decimal Number : ");
        decimal_Number = in.nextInt();
        qout = decimal_Number;

        while (qout != 0) {
            oct[i++] = qout % 8;
            qout = qout / 8;

        }
        System.out.print("Octal Number is: ");
        for (j = i - 1; j >= 0; j--) {
            System.out.print(oct[j]);
        }
        System.out.print("\n");
    }

}
