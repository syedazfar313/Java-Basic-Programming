// 7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
// Test Data:
// Input a number: 8
// Expected Output :
// 8 x 1 = 8
// 8 x 2 = 16
// 8 x 3 = 24
// ...
// 8 x 10 = 80
package Exercise7;
import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Number :");
        int number1 = sc.nextInt();
       
        for(int i=0; i< 10; i++) {
            System.out.println(number1 + " * " + (i+1) + " = " +(number1*(i+1)));
        }
    }

    
}
