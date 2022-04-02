public class Atividade7 {
    public static void main(String[] args) {
        int valorX = 13;
        while (valorX > 1) {
            if (valorX % 2 == 0) {
                valorX = valorX / 2;
            } else {
                valorX = 3 * valorX + 1;
            };
            if (valorX != 1) {
                System.out.print(valorX + " -> ");
            } else {
                System.out.print(valorX);
            }
            
        }
    }
}
