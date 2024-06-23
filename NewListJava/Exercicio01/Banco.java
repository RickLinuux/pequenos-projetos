public class Banco {
    /*Faça uma classe sequencial que dados o valor do depósito em uma poupança e a taxa de juros, informar o valor 
do rendimento (lucro) e o valor final (saldo resultante). */    
    public static void main(String[] args){
        Poupanca poupanca = new Poupanca();

        double saldo = 1.500 , taxa = 0.10;
        poupanca.depositar(saldo, taxa);

        
       
        System.out.println("");
        System.out.printf("Aplicação inicial de %.3f com uma taxa de %.2f\n ", saldo, taxa);
        System.out.printf("Aplicação %.3f\n", poupanca.aplicacaoJuros());
        System.out.printf("Saldo final %.3f\n", poupanca.montante());
    }
}