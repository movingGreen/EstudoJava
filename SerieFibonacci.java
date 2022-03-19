/**
 * SerieFibonacci
 */
public class SerieFibonacci {
    public static void main(String[] args) {
        int fibonacciA = 0, fibonacciB = 1;
        System.out.println(fibonacciA);
        System.out.println(fibonacciB); 

        for (long i = 0; fibonacciA <= 100; i++) {
            fibonacciA += fibonacciB;
            fibonacciB += fibonacciA;
            System.out.println(fibonacciA);
            System.out.println(fibonacciB); 
        }
    }
}