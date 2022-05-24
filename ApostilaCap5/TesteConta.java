package ApostilaCap5;

public class TesteConta {
    public static void main(String[] args) {
    
        Conta Conta1 = new Conta();
        Data data1 = new Data();

        Conta1.titular = "Teste1";
        Conta1.numero = 1;
        Conta1.agencia = "abc";
        Conta1.saldo = 1000.00;
        Conta1.dataDeAbertura = data1;

        Conta Conta2 = new Conta();
        Data data2 = new Data();

        Conta2.titular = "Teste1";
        Conta2.numero = 1;
        Conta2.agencia = "abc";
        Conta2.saldo = 1000.00;
        Conta2.dataDeAbertura = data2;

        if (Conta1 == Conta2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }

        System.out.println(Conta1.recuperaDadosParaImpressao());
        System.out.println(Conta2.recuperaDadosParaImpressao());
    }
}
