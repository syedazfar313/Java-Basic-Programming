//15. Write a Java program to swap two variables.

package Exercise15;

public class Exercise15 {
    public static void main(String[] args) {
        int a, b, temp;
        a = 10;
        b = 14;
        System.out.println("Before swapping: a , b = " + a + " ," + b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a , b = " + a + " ," + b);

    }

}
