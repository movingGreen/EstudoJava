public class Fatorial1a40 {
    public static void main(String[] args) {
        long fatorial = 1;
        for (int n = 1; n <= 40; n++) {
            fatorial = fatorial * n;
            System.out.println("O fatorial de " + n + "é (!" + (n-1) + ") * "+ n + " = " + fatorial);
        }
    }    
}