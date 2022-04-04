package ApostilaCap4;

public class TesteConta {
    public static void main(String[] args) {
    
        Conta Conta1 = new Conta();

        Conta1.titular = "Teste1";
        Conta1.numero = 1;
        Conta1.agencia = "abc";
        Conta1.saldo = 1000.00;
        Conta1.dataDeAbertura = "10/10/2010";

        Conta Conta2 = new Conta();

        Conta2.titular = "Teste1";
        Conta2.numero = 1;
        Conta2.agencia = "abc";
        Conta2.saldo = 1000.00;
        Conta2.dataDeAbertura = "10/10/2010";

        if (Conta1 == Conta2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
    }
}
