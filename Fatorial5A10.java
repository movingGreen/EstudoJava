public class Fatorial5A10 {
    public static void main(String[] args) {
        int valorFatorial = 5;
        for (int i = valorFatorial; i < 11; i++) {
            
            valorFatorial = i;
            for (int j = i; j > 1; j--) {

                valorFatorial *= (j-1);
            }
            System.out.println("O fatorial de " + i + " é = " + valorFatorial );
        }
    }
}