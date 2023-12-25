// Write a Java program to check whether Java is installed on your computer.
// Expected Output

// Java Version: 1.8.0_71                                                            
// Java Runtime Version: 1.8.0_71-b15                                                
// Java Home: /opt/jdk/jdk1.8.0_71/jre                                               
// Java Vendor: Oracle Corporation                                                   
// Java Vendor URL: http://Java.oracle.com/                                          
// Java Class Path: .

package Exercise22;

public class Exercise22 {
    public static void main(String[] args) {
        // Display Java version
        System.out.println("\nJava Version: " + System.getProperty("java.version"));

        // Display Java runtime version
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));

        // Display Java home directory
        System.out.println("Java Home: " + System.getProperty("java.home"));

        // Display Java vendor name
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));

        // Display Java vendor URL
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));

        // Display Java class path
        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");

    }

}
