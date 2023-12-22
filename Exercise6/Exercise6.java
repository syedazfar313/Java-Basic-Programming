// 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
// Test Data:
// Input first number: 125
// Input second number: 24
// Expected Output :
// 125 + 24 = 149
// 125 - 24 = 101
// 125 x 24 = 3000
// 125 / 24 = 5
// 125 mod 24 = 5
package Exercise6;

public class Exercise6 {
    public static void main(String[] args) {
        int number1 = 125;
        int number2 = 24;
        System.out.println(number1 + "+" + number2+ "=" +( number1 + number2));
        System.out.println(number1 + "-" + number2+ "=" +( number1 - number2));
        System.out.println(number1 + "*" + number2+ "=" +( number1 * number2));
        System.out.println(number1 + "/" + number2+ "=" +( number1 / number2));
    }
    
}
