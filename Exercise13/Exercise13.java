// 13. Write a Java program to print the area and perimeter of a rectangle.
// Test Data:
// Width = 5.5 Height = 8.5
// Expected Output
// Area is 5.6 * 8.5 = 47.60
// Perimeter is 2 * (5.6 + 8.5) = 28.20
package Exercise13;

public class Exercise13 {
    
    //define variable 
    final double Width = 5.5;
    final double Height = 8.5;
    
    public static void main(String[] args) {
        
        double area = Width * Height;
        double perimeter = 2* (Width * Height);
        
        System.out.println("Area is 5.6 * 8.5 = " + area);
        System.out.println("Perimeter is 2 * (5.6 + 8.5) =" + perimeter );

    }
    
}
