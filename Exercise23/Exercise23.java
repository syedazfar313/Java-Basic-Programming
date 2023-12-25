//  Write a Java program to compare two numbers.
// Input Data:
// Input first integer: 25
// Input second integer: 39
// Expected Output
// 25 != 39                                                                          
// 25 < 39                                                                           
// 25 <= 39

package Exercise23;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {

        // declare variables for store values
        int Number1, Number2;

        // create a object of Scanner class
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        Number1 = in.nextInt();

        System.out.print("Enter second Number: ");
        Number2 = in.nextInt();

        if (Number1 == Number2)
            System.out.printf("%d == %d\n", Number1, Number2);

        if (Number1 != Number2)
            System.out.printf("%d != %d\n", Number1, Number2);

        if (Number1 < Number2)
            System.out.printf("%d < %d\n", Number1, Number2);

        if (Number1 > Number2)
            System.out.printf("%d > %d\n", Number1, Number2);

        if (Number1 >= Number2)
            System.out.printf("%d >= %d\n", Number1, Number2);

        if (Number1 <= Number2)
            System.out.printf("%d <= %d\n", Number1, Number2);

    }

}
