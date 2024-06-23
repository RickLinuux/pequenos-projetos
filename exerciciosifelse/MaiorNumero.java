package exerciciosifelse;
import java.util.*;
public class MaiorNumero {
    public static void main(String[] args) {
        /*Escreva um programa para ler 
        3 valores inteiros e escrever o maior deles. Considere que o usuário não
informará valores iguais.*/
        int valor, valor2,valor3;
        
        Scanner read = new Scanner(System.in);

        System.out.println("Informe um número");
        valor = read.nextInt();

        System.out.println("Informe mais um número");
        valor2 = read.nextInt();

        System.out.println("Informe outro número");
        valor3 = read.nextInt();


        if(valor > valor2 && valor > valor3){
            System.out.println("Maior numero digitado " + valor);
        }   
        else if(valor3 > valor && valor3 > valor2){
            
            System.out.println("O maior valor digitado é "+ valor3);
        }
        else{
            System.out.println("O maior valor digitado é "+ valor2);
        }

    }
}
