/**
 * SerieFibonacci
 */
public class SerieFibonacci {
    public static void main(String[] args) {
        int fibonacciA = 0, fibonacciB = 1;
        System.out.println(fibonacciA);
        System.out.println(fibonacciB); 

        while (fibonacciA <= 100) {
            fibonacciA += fibonacciB;
            fibonacciB += fibonacciA;
            System.out.println(fibonacciA);
            System.out.println(fibonacciB); 
        }
    }
}