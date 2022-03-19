public class Fatorial1a10 {
    public static void main(String[] args) {
        for (int n = 1, fatorial = 1; n <= 10; n++) {
            fatorial = fatorial * n;
            System.out.println("O fatorial de " + n + "é (!" + (n-1) + ") * "+ n + " = " + fatorial);
        }
    }    
}