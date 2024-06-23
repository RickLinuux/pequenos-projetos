import java.util.*;
public class TotalPar{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int i = 0, totPar = 0, qtd;         

        System.out.println("Informe a quantidade de números para ser armazenado");
        qtd = read.nextInt();
        //Array é inicializado com o valor informado
        int[] number = new int[qtd];

        while(i < qtd){
            System.out.println("Informe o " + i + "º numero");
            number[i] = read.nextInt();

            if(number[i] % 2 == 0){
                ++totPar;
            }
            ++i;
        }
        System.out.println(" O total de números pares é igual a " + totPar);
    }
}
