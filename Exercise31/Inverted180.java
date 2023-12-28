package Exercise31;

public class Inverted180 {
    public static void main(String[] args) {
        int n = 4;

        // outer loop
        for (int i = 0; i <= n; i++) {

            // inner loop for printing space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // inner loop for printing *

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
