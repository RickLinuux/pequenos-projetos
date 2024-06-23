package problemsinvolvingties;
/*Crie um aplicativo bancário em Java que pede o valor do depósito inicial, o valor do investimento mensal e o número
de meses que o dinheiro vai ficar rendendo na poupança.
Após isso, calcule o lucro obtido, sabendo que o juros da poupança é de 0,5%.*/
import java.util.*;
import java.util.*;
public class ExeDois {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        double valor, valorMonth, fess = 0 ;
        int month;

        System.out.println("Informe o valor de depósito incial");
        valor = read.nextDouble();

        System.out.println("Informe o valor mensal que será acrescido ");
        valorMonth = read.nextDouble();

        System.out.println("Informe a quantidade de meses que ficará investido ");
        month = read.nextInt();
        
        //inicia o "fess" com o valor do deposito inicial
        fess = valor;
        // enquanto o número de meses for maior ou igual a 1 executa 
        while(month >= 1){
            // Aplica o juros de 0,5% no valor inicial
            fess += (fess * 0.005);
            
            //Adiciona  o valor do depósito mensal ao saldo total
            fess += valorMonth;
             
            //Decrementa o mes até chegar no primeiro
            --month;
        }
        System.out.printf("O valor inicial investido foi de %.2f R$, O lucro final é de %.2f R$, O rendimento de juros foi de %.2f R$ \n",
        valor, fess, (fess - valor));
    }
}
