package exerciciosifelse;
import java.util.*;
public class Crescente {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int numero1, numero2, numero3; 

        System.out.println("Informe um número: ");
        numero1 = read.nextInt();

        System.out.println("Informe um número: ");
        numero2 = read.nextInt();

        System.out.println("Informe um número: ");
        numero3 = read.nextInt();

        if(numero1 > numero2 && numero1 > numero3){
            if(numero2 > numero3){
                System.out.println("A ordem crescente dos números informados é ");
                System.out.println(numero3);
                System.out.println(numero2);
                System.out.println(numero1);   
            } else {
                System.out.println("A ordem crescente dos números informados é ");
                System.out.println(numero2);
                System.out.println(numero3);
                System.out.println(numero1);  
            }
        }
        else if(numero2 > numero1 && numero2 > numero3){
            if(numero1 > numero3){
                System.out.println("A ordem crescente dos números informados é ");
                System.out.println(numero3);
                System.out.println(numero1);
                System.out.println(numero2);  
            } else {
                System.out.println("A ordem crescente dos números informados é ");
                System.out.println(numero1);
                System.out.println(numero2);  
                System.out.println(numero3);
            }
        }
        else if(numero3 > numero1 && numero3 > numero2){
            if(numero2 > numero1){
                System.out.println("A ordem crescente dos números informados é ");
                System.out.println(numero1);
                System.out.println(numero2);
                System.out.println(numero3);  
            } else {
                System.out.println("A ordem crescente dos números informados é ");
                System.out.println(numero2);
                System.out.println(numero1);
                System.out.println(numero3);  
            }
        }
    }
}
