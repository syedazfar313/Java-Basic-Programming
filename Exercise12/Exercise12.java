// 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
package Exercise12;

import java.util.Scanner;;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("first number: ");
        int num1 = sc.nextInt();

        System.out.println("Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("Third Number: ");
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        double average = sum / 3;
        System.out.println("sum of three Number is: " + sum);
        System.out.println("Average of the three Number is : " + average);
    }
}
