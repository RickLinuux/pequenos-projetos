package exerciciosifelse;
import java.util.*;
public class Valor {
   
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int valor, valor2;

        System.out.println("Informe um valor: ");
        valor = read.nextInt();

        System.out.println("Informe outro valor: ");
        valor2 = read.nextInt();

        
        if(valor > valor2){
            System.out.println("O maior número é " + valor);
        }
        else{
            System.out.println("O maior valor é " + valor2);
        }
        
    }
}
