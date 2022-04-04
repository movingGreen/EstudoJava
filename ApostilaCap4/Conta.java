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
        return "\n==============\ntitular: " + this.titular + "\nNumero: " + this.numero + "\nAgência: " + this.agencia + "\nSaldo: " + this.saldo + "\nData de abertura: " + this.dataDeAbertura + "\nRendimento: " + calculaRendimento();
    }
}