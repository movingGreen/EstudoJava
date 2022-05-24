package ApostilaCap5;

public class Conta {
    private static int quantidadeDeContas;
    private int numero;
    private String titular;
    private String agencia;
    private double saldo;
    private Data dataDeAbertura;
    
    Conta(String titular) {
        quantidadeDeContas++;
    }

    public String getTitular() {
        return titular;
    }

    String recuperaDadosParaImpressao(){
        String dados = "\nTitular: " + this.titular;
        dados += "\nNumero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nData de abertura: " + this.dataDeAbertura.formatada();
        return dados;
    }

    
}