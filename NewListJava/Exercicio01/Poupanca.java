public class Poupanca {

    double saldo = 0d, juros = 0d;

    public void depositar(double valor, double taxa ){
        saldo = saldo + valor;
        juros = juros + taxa;
    }

    public Double aplicacaoJuros(){
        return saldo * juros;
    }

    public Double montante(){
        return saldo + aplicacaoJuros();
    }
}
