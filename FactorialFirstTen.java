public class FactorialFirstTen {
    public static void main(String[] args) {
        // Use long to prevent integer overflow
        long factorial = 1; 
        
        System.out.println("Factorial of the first 10 numbers:");
        System.out.println("-----------------------------------");
        
        // Loop to calculate and print factorials from 1 to 10
        for (int i = 1; i <= 10; i++) {
            factorial *= i; // Multiplies the previous factorial by the current number
            System.out.println("Factorial of " + i + "! = " + factorial);
        }
    }
}
