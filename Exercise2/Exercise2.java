package Exercise2;

public class Exercise2 {
    public static void main(String[] args){
        int a = 1;
        int b = 2;

        int c = Add(a, b);
        System.out.println(String.format("Sum of %d, %d is %d", a, b, c));
    }

    private static int Add(int a, int b) {
        return a + b;
    }
}
