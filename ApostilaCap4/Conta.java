package ApostilaCap4;

public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    Data dataDeAbertura;

    void saca (double valor){
        this.saldo -= valor;
    }
    void deposita(double valor){
        this.saldo += valor;
    }
    double calculaRendimento(){
        return this.saldo * 0.1;
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