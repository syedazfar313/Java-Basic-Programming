// 5. Write a Java program that takes two numbers as input and displays the product of two numbers.
// Test Data:
// Input first number: 25
// Input second number: 5
// Expected Output :
// 25 x 5 = 125
package Exercise5;
import java.util.Scanner;
public class Exercise5 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Your First number: ");
    int number1 = sc.nextInt();

    System.out.println("Enter your second Number: ");
    int number2 = sc.nextInt();
    
    System.out.println(number1 + "*"+number2 + "=" + number1*number2);
    

}
    
}
